package com.user.controller;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class MainControllerTest 
{
	@Autowired
	private  MainController controller;
	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	

	
}
