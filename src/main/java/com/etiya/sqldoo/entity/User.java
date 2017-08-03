/**
 *
 * @author ertan.yildiz
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.etiya.sqldoo.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author ertan.yildiz
 */
@Entity
@Table(name = "sqldoo_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "full_name")
    private String fullName;
    @Transient
    private String token;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public User(String userName, String password, String fullName) {

        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
    }
    
    public User(Integer userId, String userName, String password, String fullName) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.fullName = fullName;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}
