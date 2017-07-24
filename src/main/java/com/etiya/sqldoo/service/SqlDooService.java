package com.etiya.sqldoo.service;

import com.etiya.sqldoo.model.Account;
import java.util.List;

import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.model.SearchColumn;

public interface SqlDooService {
	

    public Account authenticate(Account account);	
    public boolean addAccount(Account account);
    

    public List<Menu> listMyMenu(int userId);
    public boolean addMenu(Menu menu);
    

    public List<SearchColumn> listSearchColumn(Integer menuId);    
    public boolean addSearchColumn(SearchColumn search);

}
