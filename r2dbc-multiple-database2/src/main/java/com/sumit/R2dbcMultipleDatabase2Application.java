package com.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
public class R2dbcMultipleDatabase2Application {

	public static void main(String[] args) {
		SpringApplication.run(R2dbcMultipleDatabase2Application.class, args);
	}

}
