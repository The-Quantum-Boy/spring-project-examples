package com.se.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.se.transaction.service.ProductService;

@SpringBootApplication
public class JpaTransactionMagnt2Application implements ApplicationRunner {
	
	@Autowired
	private ProductService productService;

	public static void main(String[] args) {
		SpringApplication.run(JpaTransactionMagnt2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		productService.SaveProductInfo();
	}

}
