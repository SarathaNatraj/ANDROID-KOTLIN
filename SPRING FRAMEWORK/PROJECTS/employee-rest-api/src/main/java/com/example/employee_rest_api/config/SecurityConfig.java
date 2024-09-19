package com.example.employee_rest_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig{
	
	@Bean
	public SecurityFilterChain securityFilterchain(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.requestMatchers("/employees/**,/public/**").permitAll()
		.anyRequest().authenticated()
		.and()
		.httpBasic();
		
		return http.build();
		
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("admin").password("{noop}a").roles("user").build());
		
		return manager;
	}
	
	

}
