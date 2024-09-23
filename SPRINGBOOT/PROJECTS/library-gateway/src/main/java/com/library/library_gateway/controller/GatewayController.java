package com.library.library_gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class GatewayController {
	
	

	@GetMapping("/")
	@ResponseBody
	public String hello() {
		return "hello from Gateway";
		
	}

}
