package com.sumit.auditing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringDataAuditingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataAuditingExampleApplication.class, args);
	}

}
