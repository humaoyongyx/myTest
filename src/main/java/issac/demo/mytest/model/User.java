package issac.demo.mytest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by issac.hu on 2018/3/30.
 */
@Entity
@Table(name = "user_test")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Date loginTime;

    public User(){}
    public User(Integer id,String name,Date loginTime){
     this.id=id;
     this.name=name;
     this.loginTime=loginTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loginTime=" + loginTime +
                '}';
    }
}
