package com.etiya.sqldoo;

import com.etiya.sqldoo.model.Account;
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

		SearchColumn search1 = new SearchColumn(2, "SearchColumn 2.1");
		SearchColumn search2 = new SearchColumn(2, "SearchColumn 2.2");
		SearchColumn search3 = new SearchColumn(3, "SearchColumn 3");
		SearchColumn search4 = new SearchColumn(4, "SearchColumn 4.1");
		SearchColumn search5 = new SearchColumn(4, "SearchColumn 4.2");

		SqlDooUtil.filterList.add(search1);
		SqlDooUtil.filterList.add(search2);
		SqlDooUtil.filterList.add(search3);
		SqlDooUtil.filterList.add(search4);
		SqlDooUtil.filterList.add(search5);
                
		Account account= new Account(1,"Ertan","yıldız","asdsa");
                Account account2= new Account(2,"Ertan2","yıldız2","asdsa2");
                Account account3= new Account(3,"Ertan3","yıldız3","asdsa3");
                Account account4= new Account(4,"Ertan4","yıldız4","asdsa4");
                Account account5= new Account(5,"Ertan5","yıldız5","asdsa5");
                SqlDooUtil.accountList.add(account);
                SqlDooUtil.accountList.add(account2);
                SqlDooUtil.accountList.add(account3);
                SqlDooUtil.accountList.add(account4);
                SqlDooUtil.accountList.add(account5);
	}
}
