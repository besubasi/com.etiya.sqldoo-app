package com.etiya.sqldoo.service;

import com.etiya.sqldoo.model.User;
import java.util.List;

import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.model.SearchColumn;

public interface SqlDooService {
	

    public User authenticate(User user);	
    public boolean addUser(User user);
    

    public List<Menu> listMyMenu(Integer userId);
    public boolean addMenu(Menu menu);
    

    public List<SearchColumn> listSearchColumn(Integer menuId);    
    public boolean addSearchColumn(SearchColumn search);

}
