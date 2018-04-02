package issac.demo.mytest.dao;

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
public class DemoDaoTest {

    @Autowired
    DemoDao demoDao;

    @Test
    public void testAdd(){
        demoDao.add();
    }
}
