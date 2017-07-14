package com.etiya.sqldoo.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.model.SearchColumn;
import com.etiya.sqldoo.service.SqlDooService;
import com.etiya.sqldoo.util.SqlDooUtil;

/**
 *
 * @author ertan.yildiz
 */
@Service
public class SqlDooServiceImpl implements SqlDooService {

    @Override
    public List<Menu> loadDynamicMenuList(int userId) {
        return SqlDooUtil.menuList;
    }

    @Override
    public boolean addMenu(Menu menu) {
        SqlDooUtil.menuList.add(menu);
        return true;
    }

    @Override
    public List<SearchColumn> listSearchColumn(Integer menuId) {
        return SqlDooUtil.filterList;
    }

    @Override
    public boolean addSearchColumn(SearchColumn search) {
        SqlDooUtil.filterList.add(search);
        return true;
    }

}
