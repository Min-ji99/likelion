package com.line.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDaoFactory {
    //조립
    @Bean
    public UserDao awsUserDao(){
        UserDao userDao=new UserDao(new AwsConnectionMaker());
        return userDao;
    }
    /*
    public UserDao localUserDao(){
        UserDao userDao=new UserDao(new LocalConnectionMaker());
        return userDao;
    }*/
}
