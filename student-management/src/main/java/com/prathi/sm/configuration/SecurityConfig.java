package com.prathi.sm.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity(debug=true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource datasource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
//		auth.inMemoryAuthentication().withUser("Prathi").password("{noop}Prathi123").roles("admin");
		
		auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(new BCryptPasswordEncoder());
		
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/showStudentpage","/save-Student","/updateStudent","/deleteStudent").authenticated()
		.antMatchers("/showStudent").permitAll()
		.and().formLogin().and().httpBasic();
	}
}
