package com.newsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NewsapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewsapiApplication.class, args);
		
	}
	@Bean
	public RestTemplate restTemplate() {
		RestTemplate template = new RestTemplate();
	
		return template;
	}

}
