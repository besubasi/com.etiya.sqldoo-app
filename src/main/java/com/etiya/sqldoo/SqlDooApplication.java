package com.etiya.sqldoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
		
		
		Menu menu1 = new Menu(1, 0, userId, "Menüler", true, true, true) ;
		
		Menu menu1sub1 = new Menu(2, 1, userId, "Cars", false, false, true) ;
		Menu menu1sub2 = new Menu(3, 1, userId, "Computers", false, false, true) ;
		Menu menu1sub3 = new Menu(4, 1, userId, "Teams", false, false, true) ;


		
		List<Menu> menu1subList = new ArrayList<Menu>();
		menu1subList.add(menu1sub1);
		menu1subList.add(menu1sub2);
		menu1subList.add(menu1sub3);
		
		menu1.setItems(menu1subList);
		

		Menu menu2 = new Menu(5, 0, userId, "Diğer Menüler", true, true, true) ;
		
		SqlDooUtil.menuList.add(menu1);
		SqlDooUtil.menuList.add(menu2);
        int menuId;
                
                SearchColumn search= new SearchColumn(1,"filtertry","search","searcmachine",5,6);
                SearchColumn search2= new SearchColumn(2,"filtertry2","search2","searcmachine2",5,6);
                
                SqlDooUtil.filterList.add(search);
                SqlDooUtil.filterList.add(search2);
	}
}
