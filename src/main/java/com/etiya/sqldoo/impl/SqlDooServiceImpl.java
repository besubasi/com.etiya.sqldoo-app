package com.etiya.sqldoo.impl;

import com.etiya.sqldoo.model.Account;

import java.util.ArrayList;
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
    public Account authenticate(Account acct) {
        for (Account account : SqlDooUtil.accountList) {
            if (account.getUserName().equals(acct.getUserName())
                    && account.getPassword().equals(acct.getPassword())) {
                account.setToken(String.valueOf(System.currentTimeMillis()));
                return account;
            }
        }
        return null;
    }
    
    @Override
    public boolean addAccount(Account account) {
        SqlDooUtil.accountList.add(account);
        return true;
    }    
    

    @Override
    public List<Menu> listMyMenu(int userId) {
    	List<Menu> myMenuList = new ArrayList<Menu>();
    	for(Menu menu : SqlDooUtil.menuList){
    		if(menu.getUserId() > 0 && menu.getUserId() == userId )
    			myMenuList.add(menu);
    	}
    	
        return myMenuList;
    }


    @Override
    public boolean addMenu(Menu menu) {
        SqlDooUtil.menuList.add(menu);
        return true;
    }


    @Override
    public List<SearchColumn> listSearchColumn(Integer menuId) {
        return SqlDooUtil.searchList;
    }

    @Override
    public boolean addSearchColumn(SearchColumn search) {
        SqlDooUtil.searchList.add(search);
        return true;
    }

}
