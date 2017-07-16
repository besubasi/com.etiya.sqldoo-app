package com.etiya.sqldoo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.etiya.sqldoo.model.Menu;
import com.etiya.sqldoo.model.SearchColumn;
import com.etiya.sqldoo.util.SqlDooUtil;

@SpringBootApplication
public class SqlDooApplication {

	public static final Date startTime = new Date();

	public static void main(String[] args) {
		SpringApplication.run(SqlDooApplication.class, args);

		int userId = 99;

		Menu menu1 = new Menu(1, 0, userId, "Menüler", true, true, true)
				.addItem(new Menu(2, 1, userId, "Cars", false, false, true))
				.addItem(new Menu(3, 1, userId, "Computers", false, false, true))
				.addItem(new Menu(4, 1, userId, "Teams", false, false, true));

		Menu menu2 = new Menu(5, 0, userId, "Diğer Menüler", true, false, true)
				.addItem(new Menu(6, 0, userId, "Item 1", false, false, true))
				.addItem(new Menu(7, 0, userId, "Item 2", true, true, true)
						.addItem(new Menu(8, 0, userId, "Detail 1", false, false, true))
						.addItem(new Menu(9, 0, userId, "Detail 2", false, false, true)))
				.addItem(new Menu(10, 0, userId, "Item 3", false, false, true));

		SqlDooUtil.menuList.add(menu1);
		SqlDooUtil.menuList.add(menu2);

		SearchColumn search = new SearchColumn(1, "filtertry", "search", "searcmachine", 5, 6);
		SearchColumn search2 = new SearchColumn(2, "filtertry2", "search2", "searcmachine2", 5, 6);

		SqlDooUtil.filterList.add(search);
		SqlDooUtil.filterList.add(search2);
	}
}
