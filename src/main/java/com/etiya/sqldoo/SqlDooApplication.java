package com.etiya.sqldoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Date;

@SpringBootApplication
@ComponentScan ("com.etiya.sqldoo")
@EnableJpaRepositories("com.etiya.sqldoo.repository")
@EnableAutoConfiguration(exclude = RepositoryRestMvcAutoConfiguration.class)
public class SqlDooApplication  extends SpringBootServletInitializer {

	public static final Date startTime = new Date();

	public static void main(String[] args) {
		SpringApplication.run(SqlDooApplication.class, args);


	}

}
