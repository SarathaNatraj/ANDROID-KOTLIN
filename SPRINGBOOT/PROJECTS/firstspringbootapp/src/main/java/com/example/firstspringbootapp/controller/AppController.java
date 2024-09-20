package com.example.firstspringbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@GetMapping("/")
	@ResponseBody
	public String index() {
		return "Welcome to Spring Boot App!";
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello from Spring Boot App!";
	}
	
	@GetMapping("/greeting")
	@ResponseBody
	public String greeting() {
		return "<h1> Greetings from Spring Boot! </h1> <br/>"
				+ "<p> Spring Boot offers a fast way to build applications. It looks at your classpath and at the beans you have configured, makes reasonable assumptions about what you are missing, and adds those items. With Spring Boot, you can focus more on business features and less on infrastructure </p>"
				+ "<br/> Is Jetty on the classpath? If so, you probably do NOT want Tomcat but instead want embedded Jetty. Spring Boot handles that for you."
					;
	}
	
	
	@GetMapping("/greet")
	@ResponseBody
	public String greet() {
		return "<h1> Greet from Spring Boot! </h1> <br/>"
				+ "<p> Spring Boot offers a fast way to build applications. It looks at your classpath and at the beans you have configured, makes reasonable assumptions about what you are missing, and adds those items. With Spring Boot, you can focus more on business features and less on infrastructure </p>"
				+ "<br/> Is Jetty on the classpath? If so, you probably do NOT want Tomcat but instead want embedded Jetty. Spring Boot handles that for you."
					;
	}

}
