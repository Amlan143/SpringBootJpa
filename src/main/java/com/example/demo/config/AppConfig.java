package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("AppConfig  constructor..");
	}
	
	@Bean
	public RestTemplate createRestTemplate() {
		RestTemplate rt = new RestTemplate();
		return rt;
	}

}
