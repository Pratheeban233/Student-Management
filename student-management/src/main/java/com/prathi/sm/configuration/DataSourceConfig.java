package com.prathi.sm.configuration;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration 
@PropertySource("classpath:DBconfig.properties")
//@PropertySource("classpath:/student-management/src/main/resources/DBconfig.properties")
public class DataSourceConfig {

	@Autowired
	Environment env;
	
	@Bean
	public JdbcTemplate jdbcTemplate()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
		
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		System.out.println("className : "+env.getProperty("spring.datasource.driverclassname"));
		
		dataSource.setDriverClassName(env.getProperty("spring.datasource.driverclassname"));
		dataSource.setUrl("spring.datasource.url");
		dataSource.setUsername("spring.datasource.username");
		dataSource.setPassword("spring.datasource.password");
		
		return dataSource;
	}
}
