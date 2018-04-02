package issac.demo.mytest.dao;

import issac.demo.mytest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by issac.hu on 2018/3/30.
 */
public interface UserDao extends JpaRepository<User,Integer>{

}
