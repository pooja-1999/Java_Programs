package com.springboot.onlinequiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class OnlineQuizSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineQuizSiteApplication.class, args);
	}

}
