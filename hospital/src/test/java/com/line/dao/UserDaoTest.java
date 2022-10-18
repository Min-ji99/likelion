package com.line.dao;

import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class UserDaoTest {
    @Test
    @DisplayName("users table insert 확인")
    void addAndSelect(){
        AWSUserDaoImpl userDao = new AWSUserDaoImpl();
        User user = new User("6", "jimin", "qwer");
        userDao.add(user);

        User selectedUser = userDao.searchId("6");
        Assertions.assertEquals("jimin", selectedUser.getName());
    }
}