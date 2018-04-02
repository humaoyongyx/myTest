package issac.demo.mytest.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by issac.hu on 2018/3/30.
 */
@Repository
public class DemoDao {

    public void add(){
        System.out.println("demodao add...");
    }

    public void del(){
        System.out.println("demodao del...");
    }
}
