package com.dbexercise;

import com.dbexercise.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {
    @Test
    @DisplayName("users table insert 확인")
    void addAndSelect(){
        UserDao userDao = new UserDao();
        User user = new User("5", "mimi", "9876");
        //userDao.add(user);

        User selectedUser = userDao.searchId("5");
        Assertions.assertEquals("mimi", selectedUser.getName());
    }

}