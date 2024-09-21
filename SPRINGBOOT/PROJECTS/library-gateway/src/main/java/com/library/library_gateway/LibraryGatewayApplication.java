package com.library.library_gateway;

import java.net.http.HttpClient;

import org.apache.hc.core5.http.impl.DefaultAddressResolver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class LibraryGatewayApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(LibraryGatewayApplication.class, args);
	}

}
