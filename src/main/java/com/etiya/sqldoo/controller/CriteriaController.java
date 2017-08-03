package com.etiya.sqldoo.controller;

import com.etiya.sqldoo.entity.Criteria;
import com.etiya.sqldoo.service.CriteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 *
 * @author bekir.subasi
 *
 */
@RestController
@RequestMapping("/criteria")
public class CriteriaController {

    @Autowired
    private CriteriaService criteriaService;


    @CrossOrigin
    @RequestMapping(value = "/listCriteria", method = RequestMethod.GET, produces = "application/json")
    public List<Criteria> listCriteria(HttpServletRequest request) throws ServletException {
        String menuIdParam = request.getParameter("menuId");
        Integer menuId = menuIdParam != null && !menuIdParam.isEmpty() ? Integer.valueOf(menuIdParam) : 0;

        return criteriaService.listCriteria(menuId);
    }


    @CrossOrigin
    @RequestMapping(value = "/addCriteria", method = RequestMethod.POST, produces = "application/json")
    public boolean addCriteria(@RequestBody Criteria criteria) throws ServletException {
        return criteriaService.addCriteria(criteria);
    }




}
