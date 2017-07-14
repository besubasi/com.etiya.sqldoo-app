package com.etiya.sqldoo.model;

import java.util.List;

public class Menu {

	private int menuId;
	private int parentMenuId;
	private int userId;
	private String name;
	private boolean isFolder;
	private boolean isExpanded;
	private boolean isActive;
	private List<Menu> items;

	public Menu() {
		super();
	}

	public Menu(int menuId, int parentMenuId, int userId, String name, boolean isExpanded, boolean isFolder,
			boolean isActive) {
		super();
		this.menuId = menuId;
		this.parentMenuId = parentMenuId;
		this.userId = userId;
		this.name = name;
		this.isExpanded = isExpanded;
		this.isFolder = isFolder;
		this.isActive = isActive;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isExpanded() {
		return isExpanded;
	}

	public void setExpanded(boolean isExpanded) {
		this.isExpanded = isExpanded;
	}

	public boolean isFolder() {
		return isFolder;
	}

	public void setFolder(boolean isFolder) {
		this.isFolder = isFolder;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public List<Menu> getItems() {
		return items;
	}

	public void setItems(List<Menu> items) {
		this.items = items;
	}

}
