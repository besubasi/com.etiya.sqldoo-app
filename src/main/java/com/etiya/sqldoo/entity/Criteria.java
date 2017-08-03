package com.etiya.sqldoo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by bekir.subasi on 8/2/2017.
 */

@Entity
@Table(name = "sqldoo_criteria")
public class Criteria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "criteria_id")
    private Integer criteriaId;

    @Basic
    @Column(name = "menu_id")
    private Integer menuId;

    @Basic
    @Column(name = "user_id")
    private Integer userId;

    @Basic
    @Column(name = "label")
    private String label;

    @Basic
    @Column(name = "type")
    private String type;

    @Basic
    @Column(name = "position")
    private String position;

    @Basic
    @Column(name = "width")
    private Integer width;

    @Basic
    @Column(name = "short_code")
    private String shortCode;

    @Basic
    @Column(name = "sql_criteria")
    private String sqlCriteria;


    public Criteria() {

    }



    public Criteria(Integer menuId, String label) {
        this.menuId = menuId;
        this.label = label;
    }




    public Integer getCriteriaId() {
        return criteriaId;
    }

    public void setCriteriaId(Integer criteriaId) {
        this.criteriaId = criteriaId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getSqlCriteria() {
        return sqlCriteria;
    }

    public void setSqlCriteria(String sqlCriteria) {
        this.sqlCriteria = sqlCriteria;
    }
}
