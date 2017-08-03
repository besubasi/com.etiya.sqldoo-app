package com.etiya.sqldoo.service.impl;

import com.etiya.sqldoo.entity.Menu;
import com.etiya.sqldoo.repository.MenuRepository;
import com.etiya.sqldoo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bekir.subasi on 8/1/2017.
 */
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;


    @Override
    public List<Menu> listMyMenu(Integer userId) {
        List<Menu> userMenuList =  menuRepository.findFirstLevelParentMenu(userId);
        return userMenuList;
    }

    @Override
    public boolean addMenu(Menu menu) {
        menuRepository.save(menu);
        return true;
    }
}
