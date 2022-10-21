package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {
    @Bean
    UserDao awsUserDao(){
        return new UserDao(new AwsConnectionMaker());
    }

}
