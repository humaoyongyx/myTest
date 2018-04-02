package issac.demo.mytest.mock;

import issac.demo.mytest.contract.IService;
import issac.demo.mytest.dao.UserDao;
import issac.demo.mytest.model.User;
import issac.demo.mytest.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.Date;

import static org.mockito.Mockito.*;

/**
 * Created by issac.hu on 2018/4/2.
 */
@RunWith(MockitoJUnitRunner.class)
public class MockUserTest {

    @Mock
    UserDao userDao;

    @InjectMocks
    UserService userService;

    public  MockUserTest(){
        //也可以这样来初始化mock注解对象
      //  MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testInjectAndMock(){
        when(userDao.findOne(1)).thenReturn(new User(1,"user1",new Date()));
        System.out.println(userService.get(1));
    }

    @Test
    public void testVerify(){
        User user = new User();
        userDao.save(user);
        verify(userDao).save(user);
    }

    @Test(expected = RuntimeException.class)
    public void testException(){
        //System.out.println(1/0);
        doThrow(new RuntimeException("runtime...")).when(userDao).getOne(1);
        userDao.getOne(1);
    }

    @Test
    public void testInorder(){
        User user = new User();
        userDao.save(user);
        userDao.delete(user);
        InOrder inOrder = inOrder(userDao);
        inOrder.verify(userDao).save(user);
       // reset(userDao);
        inOrder.verify(userDao).delete(user);
    }

    @Test
    public void testTimeOut(){
        IServiceImp iServiceImp=new IServiceImp();

        IServiceImp spy = spy(iServiceImp);
        spy.say("name");
        when(spy.say("name")).thenReturn("name");
        verify(spy,timeout(1)).say("name");
    }


    public  static class IServiceImp implements IService{

        @Override
        public String say(String name) {
            System.out.println("IServiceImp ... name");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }


}
