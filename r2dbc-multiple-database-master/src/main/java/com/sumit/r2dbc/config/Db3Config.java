package com.sumit.r2dbc.config;

import static io.r2dbc.spi.ConnectionFactoryOptions.DATABASE;
import static io.r2dbc.spi.ConnectionFactoryOptions.DRIVER;
import static io.r2dbc.spi.ConnectionFactoryOptions.HOST;
import static io.r2dbc.spi.ConnectionFactoryOptions.PASSWORD;
import static io.r2dbc.spi.ConnectionFactoryOptions.USER;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.core.DefaultReactiveDataAccessStrategy;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.r2dbc.dialect.PostgresDialect;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.data.r2dbc.repository.support.R2dbcRepositoryFactoryBean;
import org.springframework.r2dbc.core.DatabaseClient;

import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;

@Configuration
@EnableR2dbcRepositories(
        basePackages = {"com.sumit.r2dbc.db3.repositories"},
        repositoryFactoryBeanClass = R2dbcRepositoryFactoryBean.class,
        entityOperationsRef = "db3tmplt"
)
public class Db3Config extends AbstractR2dbcConfiguration {

    @Bean(name = "db3tmplt")
    public R2dbcEntityTemplate r2dbcEntityTemplate(@Qualifier("db3Client") DatabaseClient databaseClient) {
        return new R2dbcEntityTemplate(databaseClient, new DefaultReactiveDataAccessStrategy(PostgresDialect.INSTANCE));
    }


    @Bean(name = "db3ConnectionFactory")
    public ConnectionFactory db2connectionFactory(){
        System.out.println("Db3Config.connectionFactory");
        return ConnectionFactories.get(
                ConnectionFactoryOptions.builder()
                        .option(DRIVER, "postgresql")
                        .option(HOST, "172.29.10.225")
                        .option(USER, "myusername")
                        .option(PASSWORD, "mypassword")
                        .option(DATABASE, "database3")
                        .build());
    }

    @Bean(name = "db3Client")
    public DatabaseClient databaseClient(@Qualifier("db3ConnectionFactory") ConnectionFactory connectionFactory){
        return DatabaseClient.create(connectionFactory);
    }


    @Override
    public ConnectionFactory connectionFactory() {
        return db2connectionFactory();
    }

}
