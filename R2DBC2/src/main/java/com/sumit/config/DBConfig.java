package com.sumit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.r2dbc.core.DatabaseClient;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;

@Configuration
public class DBConfig {

	
	@Bean
	PostgresqlConnectionFactory connectionFactory() {
		return new PostgresqlConnectionFactory(
				PostgresqlConnectionConfiguration.builder()
				.host("localhost")
				.database("postgress")
				.username("myusername")
				.password("mypassword")
				.build()
		);
	}
	
	@Bean
	DatabaseClient databaseClient(ConnectionFactory connectionFactory) {
		return DatabaseClient.builder()
				.connectionFactory(connectionFactory)
				.build();
	}
	
	

	
	
}
