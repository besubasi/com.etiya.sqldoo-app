package com.etiya.sqldoo.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.service.SqlDooService;
import com.etiya.sqldoo.util.SqlDooEnums;


@Service
public class SqlDooServiceImpl implements SqlDooService{
	

	@Override
	public List<Menu> loadDynamicMenuList(int userId){
		List<Menu> menuList = new ArrayList<Menu>();
		Menu menu1 = new Menu(1, 0, userId, "Menüler", true);
		Menu menu1sub1 = new Menu(2, 9, userId, "Cars", false);
		Menu menu1sub2 = new Menu(3, 0, userId, "Computers", false);
		Menu menu1sub3 = new Menu(4, 0, userId, "Teams", false);
		
		List<Menu> menu1subList = new ArrayList<Menu>();
		menu1subList.add(menu1sub1);
		menu1subList.add(menu1sub2);
		menu1subList.add(menu1sub3);
		
		menu1.setItems(menu1subList);
		

		Menu menu2 = new Menu(5, 0, userId, "Menüler", true);
		
		menuList.add(menu1);
		menuList.add(menu2);
		
		return menuList;
	}
	
	


	@Override
	public String getClearSettleUrl() {
		StringBuilder builder = new StringBuilder();
		for (SqlDooEnums.ClearSettle urlEnum : SqlDooEnums.ClearSettle.values()) {
			builder.append(urlEnum.name()).append(" = ").append(urlEnum.toString()).append("<br>");
		}

		return builder.toString();
	}

	
}
