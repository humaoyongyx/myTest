package issac.demo.mytest.service;

import issac.demo.mytest.dao.UserDao;
import issac.demo.mytest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by issac.hu on 2018/4/2.
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User get(Integer id){
       return  userDao.findOne(id);
    }
}
