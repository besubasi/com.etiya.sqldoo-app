package com.etiya.sqldoo.controller;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.model.SearchColumn;
import com.etiya.sqldoo.service.SqlDooService;

/**
 * 
 * @author bekir.subasi
 *
 */

@RestController
public class SqlDooController {

    @Autowired
    private SqlDooService sqlDooService;

    public void setSqlDooService(SqlDooService sqlDooService) {
        this.sqlDooService = sqlDooService;
    }

    /**
     * Report Api
     *
     * @param request
     * @return
     */
    @CrossOrigin
    @RequestMapping("/loadDynamicMenuList")
    @ResponseBody
    public List<Menu> loadDynamicMenuList(HttpServletRequest request) throws ServletException {
        String userIdParam = request.getParameter("userId");

        //YYYY-MM-DD
        Integer userId = userIdParam != null && !userIdParam.isEmpty() ? Integer.valueOf(userIdParam) : 0;

        return sqlDooService.loadDynamicMenuList(userId);
    }

    

    /**
     * Report Api
     *
     * @param menu
     * @return
     */
    @CrossOrigin
    @RequestMapping("/addMenu")
    @ResponseBody
    public boolean addMenu(@RequestBody Menu menu) throws ServletException {
        return sqlDooService.addMenu(menu);
    }    

    

    /**
     *
     * @param request
     * @return
     * @throws ServletException
     */
    @CrossOrigin
    @RequestMapping("/listSearchColumn")
    @ResponseBody
    public List<SearchColumn> listSearchColumn(HttpServletRequest request) throws ServletException {
        String menuIdParam = request.getParameter("menuId");

        Integer menuId = menuIdParam != null && !menuIdParam.isEmpty() ? Integer.valueOf(menuIdParam) : 0;
        return sqlDooService.listSearchColumn(menuId);

    }

    /**
     * Report Api
     *
     * @param searchColumn
     * @return
     */
    @CrossOrigin
    @RequestMapping("/addSearchColumn")
    @ResponseBody
    public boolean addSearchColumn(@RequestBody SearchColumn searchColumn) throws ServletException {

        return sqlDooService.addSearchColumn(searchColumn);
    } 
    
 

}
