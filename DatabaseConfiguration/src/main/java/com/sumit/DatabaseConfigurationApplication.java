package com.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DatabaseConfigurationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseConfigurationApplication.class, args);
	}

}
