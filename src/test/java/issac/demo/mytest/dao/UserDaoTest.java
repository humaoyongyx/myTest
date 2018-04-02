package issac.demo.mytest.dao;

import issac.demo.mytest.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by issac.hu on 2018/3/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {
    @Autowired
    UserDao userDao;

    @Test
    public void testAdd(){
        User user=new User();
        user.setId(1);
        user.setName("test1");
        userDao.save(user);

        User one = userDao.findOne(1);
        System.out.println(one);
    }

}
