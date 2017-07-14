package com.etiya.sqldoo.service;

import java.util.List;

import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.model.SearchColumn;

public interface SqlDooService {

    public List<Menu> loadDynamicMenuList(int userId);

    public boolean addMenu(Menu menu);

    public boolean addSearchColumn(SearchColumn search);

    public List<SearchColumn> listSearchColumn(Integer menuId);

}
