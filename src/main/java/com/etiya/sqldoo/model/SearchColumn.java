/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etiya.sqldoo.model;

import java.util.List;

/**
 *
 * @author ertan.yildiz
 */
public class SearchColumn {

    int menuId;
    String labelName;
    String type;
    String filtername;
    int innerWidth;
    int outherWidth;
    private List<SearchColumn> items2;

    public SearchColumn() {

    }

    public SearchColumn(int menuId, String labelName, String type, String filtername, int innerWidth, int outherWidth) {
        this.menuId = menuId;
        this.labelName = labelName;
        this.type = type;
        this.filtername = filtername;
        this.innerWidth = innerWidth;
        this.outherWidth = outherWidth;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFiltername() {
        return filtername;
    }

    public void setFiltername(String filtername) {
        this.filtername = filtername;
    }

    public int getInnerWidth() {
        return innerWidth;
    }

    public void setInnerWidth(int innerWidth) {
        this.innerWidth = innerWidth;
    }

    public int getOutherWidth() {
        return outherWidth;
    }

    public void setOutherWidth(int outherWidth) {
        this.outherWidth = outherWidth;
    }

    public List<SearchColumn> getItems2() {
        return items2;
    }

    public void setItems2(List<SearchColumn> items2) {
        this.items2 = items2;
    }

}
