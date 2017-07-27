package com.etiya.sqldoo.controller;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.sqldoo.model.User;
import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.model.RequestMenuApi;
import com.etiya.sqldoo.model.SearchColumn;
import com.etiya.sqldoo.service.SqlDooService;


/**
 *
 * @author bekir.subasi
 *
 */
@RestController
public class SqlDooController{

    @Autowired
    private SqlDooService sqlDooService;
    
    public void setSqlDooService(SqlDooService sqlDooService) {
        this.sqlDooService = sqlDooService;
    }


    @CrossOrigin
    @RequestMapping("/authenticate")
    @ResponseBody
    public User authenticate(@RequestBody User user) throws ServletException {
        if (user == null) 
            return user;

        return sqlDooService.authenticate(user);
    }
    
    
    
    @CrossOrigin
    @RequestMapping("/addUser")
    @ResponseBody
    public boolean addUser(@RequestBody User user) throws ServletException {
       return sqlDooService.addUser(user);
    }
    

    @CrossOrigin
    @RequestMapping("/listMyMenu")
    @ResponseBody
    public List<Menu> listMyMenu(@RequestBody RequestMenuApi request) throws ServletException {
        return sqlDooService.listMyMenu(request.getUserId());
    } 
    


    @CrossOrigin
    @RequestMapping("/addMenu")
    @ResponseBody
    public boolean addMenu(@RequestBody Menu menu) throws ServletException {
        return sqlDooService.addMenu(menu);
    }



    @CrossOrigin
    @RequestMapping("/listSearchColumn")
    @ResponseBody
    public List<SearchColumn> listSearchColumn(HttpServletRequest request) throws ServletException {
        String menuIdParam = request.getParameter("menuId");
        Integer menuId = menuIdParam != null && !menuIdParam.isEmpty() ? Integer.valueOf(menuIdParam) : 0;
        
        return sqlDooService.listSearchColumn(menuId);
    }


    @CrossOrigin
    @RequestMapping("/addSearchColumn")
    @ResponseBody
    public boolean addSearchColumn(@RequestBody SearchColumn searchColumn) throws ServletException {
        return sqlDooService.addSearchColumn(searchColumn);
    }

}
