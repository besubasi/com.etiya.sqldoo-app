package com.etiya.sqldoo.model;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private int menuId;
	private int parentMenuId;
	private int userId;
	private String label;
	private boolean folder;
	private boolean expanded;
	private boolean actv;
	private List<Menu> items;

	public Menu() {
		super();
	}

	public Menu addItem(Menu menu) {
		this.getItems().add(menu);
		return this;

	}

	public Menu(int menuId, int parentMenuId, int userId, String label, boolean folder, boolean expanded,
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

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public int getParentMenuId() {
		return parentMenuId;
	}

	public void setParentMenuId(int parentMenuId) {
		this.parentMenuId = parentMenuId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
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
		if(this.items == null)
			this.items = new ArrayList<Menu>();
		
		return items;
	}

	public void setItems(List<Menu> items) {
		this.items = items;
	}

}
