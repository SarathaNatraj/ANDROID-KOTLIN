package com.techacademy.springdemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class Securityconfig  extends WebSecurityConfigurerAdapter{

	protected void configure(HttpSecurity http) throws Exception {
		
		http
			.authorizeHttpRequests()
			.antMatchers("/public/***").permitAll()
			.anyRequest().authenticated()
			.and()
		.formLogin()
			.loginPage("/customer/login")
			.permitAll()
			.and()
		.logout()
			.permitAll();
		
	}
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication()
			.withUser("guest").password("{noop}guest").roles("USER")
			.and()
			.withUser("admin").password("{noop}admin").roles("ADMIN");
	}
}
