package com.etiya.sqldoo.service;

import com.etiya.sqldoo.entity.Menu;

import java.util.List;

/**
 * Created by bekir.subasi on 8/1/2017.
 */


public interface MenuService {

    public List<Menu> listMyMenu(Integer userId);

    public boolean addMenu(Menu menu);

}
