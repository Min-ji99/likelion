package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

@Configuration
public class UserDaoFactory {
    @Bean
    UserDao awsUserDao() {
        return new UserDao(awsDataSource());
    }

    @Bean
    UserDao localUserDao() {
        return new UserDao(localDataSource());
    }
    @Bean
    DataSource awsDataSource() {
        Map<String, String> env=System.getenv();
        SimpleDriverDataSource dataSource=new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl(env.get("DB_HOST"));
        dataSource.setUsername(env.get("DB_USER"));
        dataSource.setPassword(env.get("DB_PASSWORD"));

        return dataSource;
    }

    @Bean
    DataSource localDataSource() {
        Map<String, String> env=System.getenv();
        SimpleDriverDataSource dataSource=new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.cj.jdbc.Driver.class);
        dataSource.setUrl("jdbc:mysql://localhost:3306/likelion");
        dataSource.setUsername(env.get("minji"));
        dataSource.setPassword(env.get("tndtlf1145l!"));

        return dataSource;
    }
}
