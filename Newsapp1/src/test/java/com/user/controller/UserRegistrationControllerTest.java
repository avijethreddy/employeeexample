package com.user.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class UserRegistrationControllerTest {

	@Autowired
	private  UserRegistrationController controller;
	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	

}
