package com.example.bookEstore.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ApplicationConfig {
	
	@Bean
	public DataSource getDataSourceBean() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource(); 
	
		dataSource.setUrl("jdbc:mysql://localhost:3306/springdb"); //change the database
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUsername("root");
		dataSource.setPassword("Kid123");
		
		return dataSource;
		
	}

}
