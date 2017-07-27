package com.etiya.sqldoo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sqldoo_menu")
public class Menu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "menu_id")
    private Integer menuId;
    @Column(name = "parent_menu_id")
    private Integer parentMenuId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "label")
    private String label;
    @Column(name = "folder")
    private boolean folder;
    @Column(name = "expanded")
    private boolean expanded;
    @Column(name = "actv")
    private boolean actv;
    @OneToMany
    private List<Menu> items;
    @Column(name = "sql_select")
    private String select;
    @Column(name = "sql_from")
    private String from;
    @Column(name = "sql_where")
    private String where;

    public Menu() {
        super();
    }

    public Menu addItem(Menu menu) {
        this.getItems().add(menu);
        return this;

    }

    public Menu(Integer menuId, Integer parentMenuId, Integer userId, String label, boolean folder, boolean expanded,
            boolean actv) {
        super();
        this.menuId = menuId;
        this.parentMenuId = parentMenuId;
        this.userId = userId;
        this.label = label;
        this.folder = folder;
        this.expanded = expanded;
        this.actv = actv;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getParentMenuId() {
        return parentMenuId;
    }

    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isFolder() {
        return folder;
    }

    public void setFolder(boolean folder) {
        this.folder = folder;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public boolean isActv() {
        return actv;
    }

    public void setActv(boolean actv) {
        this.actv = actv;
    }

    public List<Menu> getItems() {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }

        return items;
    }

    public void setItems(List<Menu> items) {
        this.items = items;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

}
