package issac.demo.mytest.service;

import issac.demo.mytest.dao.UserDao;
import issac.demo.mytest.model.User;
import org.apache.tomcat.util.net.openssl.OpenSSLUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by issac.hu on 2018/4/2.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;
    @Autowired
    UserDao userDao;

    @Test
    public void test(){
        userDao.save(new User(1,"user1",new Date()));
        User user = userService.get(1);
        System.out.println(user);

    }
}
