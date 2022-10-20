package line.dao;

import com.line.dao.UserDao;
import com.line.dao.UserDaoFactory;
import com.line.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = UserDaoFactory.class)

class UserDaoTest {
    @Autowired
    ApplicationContext context;

    @Test
    @DisplayName("users table insert 확인")
    void addAndSelect(){
        //UserDao userDao = new UserDaoFactory().awsUserDao();
        UserDao userDao = context.getBean("awsUserDao", UserDao.class);
        User user = new User("11", "nana", "2022");
        userDao.add(user);

        User selectedUser = userDao.searchId("8");
        Assertions.assertEquals("nana", selectedUser.getName());
    }
}