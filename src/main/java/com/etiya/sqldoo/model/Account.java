/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etiya.sqldoo.model;

/**
 *
 * @author ertan.yildiz
 */
public class Account {

    private int userId;
    private String userName;
    private String password;
    private String description;
    private String token;

    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Account(int userId, String userName, String password, String description) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.description = description;

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
