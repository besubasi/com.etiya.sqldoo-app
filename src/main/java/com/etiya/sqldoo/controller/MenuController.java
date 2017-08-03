package com.etiya.sqldoo.controller;

import com.etiya.sqldoo.domain.RequestMenuApi;
import com.etiya.sqldoo.entity.Menu;
import com.etiya.sqldoo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import java.util.List;


/**
 *
 * @author bekir.subasi
 *
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;


    @CrossOrigin
    @RequestMapping(value = "/listMyMenu", method = RequestMethod.POST, produces = "application/json")
    public List<Menu> listMyMenu(@RequestBody RequestMenuApi request) throws ServletException {
        return menuService.listMyMenu(request.getUserId());
    }



    @CrossOrigin
    @RequestMapping(value="/addMenu", method = RequestMethod.POST, produces = "application/json")
    public boolean addMenu(@RequestBody Menu menu) throws ServletException {
        return menuService.addMenu(menu);
    }



}
