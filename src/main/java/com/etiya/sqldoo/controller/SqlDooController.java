package com.etiya.sqldoo.controller;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.sqldoo.model.Menu;
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
	 * @param fromDate
	 * @param toDate
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

	
	

	@RequestMapping("/clearSettleUrl")
	public String clearSettleUrl() {
		return sqlDooService.getClearSettleUrl();
	}

}
