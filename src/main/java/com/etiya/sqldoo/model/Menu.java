package com.etiya.sqldoo.model;

import java.util.List;

public class Menu {
	
	private int menuId;
	private int parentMenuId;
	private int userId;
	private String label;
	private boolean expanded;
	private List<Menu> items;

	

	public Menu() {
		super();
	}
	
	
	public Menu(int menuId, int parentMenuId, int userId, String label, boolean expanded) {
		super();
		this.menuId = menuId;
		this.parentMenuId = parentMenuId;
		this.userId = userId;
		this.label = label;
		this.expanded = expanded;
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


	public boolean isExpanded() {
		return expanded;
	}


	public void setExpanded(boolean expanded) {
		this.expanded = expanded;
	}


	public List<Menu> getItems() {
		return items;
	}


	public void setItems(List<Menu> items) {
		this.items = items;
	}
	
	
	
	

}
