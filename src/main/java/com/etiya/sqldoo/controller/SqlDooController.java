package com.etiya.sqldoo.controller;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.model.SearchColumn;
import com.etiya.sqldoo.service.SqlDooService;

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
    @RequestMapping("/addMenu")
    @ResponseBody
    public boolean addMenu(Menu menu) throws ServletException {
        return sqlDooService.addMenu(menu);
    }    

    /**
     * Report Api
     *
     * @param name
     * @return
     */
    @RequestMapping("/addMenu2")
    @ResponseBody
    public boolean addMenu2(@RequestParam("name") String label) throws ServletException {
        Menu menu = new Menu();
        menu.setLabel(label);

        return sqlDooService.addMenu(menu);
    }
    
    

    /**
     *
     * @param request
     * @return
     * @throws ServletException
     */
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
    @RequestMapping("/addSearchColumn")
    @ResponseBody
    public boolean addSearchColumn(SearchColumn searchColumn) throws ServletException {

        return sqlDooService.addSearchColumn(searchColumn);
    } 
    
    /**
     * Report Api
     *
     * @param labelName
     * @return
     */
    @RequestMapping("/addSearchColumn2")
    @ResponseBody
    public boolean addSearchColumn2(@RequestParam("labelName") String labelName) throws ServletException {
        SearchColumn searchColumn = new SearchColumn();
        searchColumn.setLabelName(labelName);
        
        return sqlDooService.addSearchColumn(searchColumn);
    }     

}
