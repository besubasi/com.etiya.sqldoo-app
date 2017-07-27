package com.etiya.sqldoo.impl;

import com.etiya.sqldoo.model.User;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.model.MenuRepository;
import com.etiya.sqldoo.model.SearchColumn;
import com.etiya.sqldoo.model.UserRepository;
import com.etiya.sqldoo.service.SqlDooService;
import com.etiya.sqldoo.util.SqlDooUtil;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ertan.yildiz
 */
@Service
public class SqlDooServiceImpl implements SqlDooService {
    @Autowired
    private UserRepository userRepository;
     public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
     @Autowired
     private MenuRepository menuRepository;
     public void setMenuRepository(MenuRepository menuRepository){
         this.menuRepository=menuRepository;
     }
    @Override
    public User authenticate(User acct) {
        for (User user : SqlDooUtil.userList) {
            if (user.getUserName().equals(acct.getUserName())
                    && user.getPassword().equals(acct.getPassword())) {
                user.setToken(String.valueOf(System.currentTimeMillis()));
                return user;
            }
        }
        return null;
    }

    @Override
    public boolean addUser(User user) {
        SqlDooUtil.userList.add(user);
        userRepository.save(user);
        return true;
    }

    @Override
    public List<Menu> listMyMenu(int userId) {
        List<Menu> myMenuList = new ArrayList<Menu>();
        for (Menu menu : SqlDooUtil.menuList) {
            if (menu.getUserId() > 0 && menu.getUserId() == userId) {
                myMenuList.add(menu);
              
            }
        }

        return myMenuList;
    }

    @Override
    public boolean addMenu(Menu menu) {
        /*for (Menu menu3 : SqlDooUtil.menuList) {
            if (menu3.getMenuId() == menu.getParentMenuId()) {
                menu3.addItem(menu);
                return true;
            }
        }*/

        SqlDooUtil.menuList.add(menu);
        menuRepository.save(menu);
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
