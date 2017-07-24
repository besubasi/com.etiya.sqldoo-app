package com.etiya.sqldoo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.etiya.sqldoo.impl.SqlDooServiceImpl;
import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.service.SqlDooService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqlDooApplicationTests {

	private final static SqlDooService sqlDooService = new SqlDooServiceImpl();

	@Test
	public void test() {

		List<Menu> menuList = sqlDooService.listMyMenu(1);
		System.out.println("We don't have Token" + menuList);

	}

}
