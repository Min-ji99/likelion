package com.line.dao;

public class UserDaoFactory {
    //조립
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
