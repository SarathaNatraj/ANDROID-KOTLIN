package com.library.bookservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		
		http
			.authorizeHttpRequests(authorizeRequests->
					authorizeRequests
						.requestMatchers("/books").authenticated()
						.anyRequest().permitAll()
						).oauth2Login()
						.and()
						.logout()
							.logoutUrl("/")
							.permitAll();
		
			return http.build();
							
		
		
	}

}
