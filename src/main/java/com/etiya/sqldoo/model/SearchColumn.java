package com.etiya.sqldoo.model;


/**
 *
 * @author ertan.yildiz
 */
public class SearchColumn {

	private int menuId;
	private String label;
	private String type;
	private String shortCode;
	private String criteria;
	private int width;
	private String position;
    


    public SearchColumn() {
		super();
		// TODO Auto-generated constructor stub
	}



	public SearchColumn(int menuId, String label) {
		super();
		this.menuId = menuId;
		this.label = label;
	}



	public int getMenuId() {
		return menuId;
	}



	public void setMenuId(int menuId) {
		this.menuId = menuId;
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



	public String getShortCode() {
		return shortCode;
	}



	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}



	public String getCriteria() {
		return criteria;
	}



	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}



	public int getWidth() {
		return width;
	}



	public void setWidth(int width) {
		this.width = width;
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}

    
    
}
