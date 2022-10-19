package line.dao;

import com.line.dao.UserDao;
import com.line.dao.UserDaoFactory;
import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class UserDaoTest {
    @Test
    @DisplayName("users table insert 확인")
    void addAndSelect(){
        UserDao userDao = new UserDaoFactory().awsUserDao();
        User user = new User("9", "nana", "2022");
        userDao.add(user);

        User selectedUser = userDao.searchId("8");
        Assertions.assertEquals("nana", selectedUser.getName());
    }
}