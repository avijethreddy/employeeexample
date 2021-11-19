package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

import com.user.repo.UserRepo;

import com.user.repo.*;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepo.class)
public class Newsappteam2Application {

	public static void main(String[] args) {
		SpringApplication.run(Newsappteam2Application.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}

}
