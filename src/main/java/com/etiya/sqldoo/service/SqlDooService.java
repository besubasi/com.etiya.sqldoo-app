package com.etiya.sqldoo.service;

import java.util.List;

import com.etiya.sqldoo.model.Menu;

public interface SqlDooService {
	
	public List<Menu> loadDynamicMenuList(int userId);
	
	public String getClearSettleUrl();

	
}
