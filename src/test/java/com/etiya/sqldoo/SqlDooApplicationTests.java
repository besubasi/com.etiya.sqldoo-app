package com.etiya.sqldoo;

import java.util.List;

import com.etiya.sqldoo.service.MenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.etiya.sqldoo.entity.Menu;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqlDooApplicationTests {

	@Autowired
	private MenuService menuService;

	@Test
	public void test() {

		List<Menu> menuList = menuService.listMyMenu(1);
		System.out.println("We don't have Token" + menuList);

	}

}
