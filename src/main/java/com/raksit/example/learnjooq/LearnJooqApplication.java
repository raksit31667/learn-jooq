package com.raksit.example.learnjooq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class LearnJooqApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnJooqApplication.class, args);
	}

}
