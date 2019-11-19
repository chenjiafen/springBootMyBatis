package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/20 0:00
 */

public class TestMybatisDao {
    SqlSessionFactory sqlSessionFactory=null;
    @Before
    public void init(){
        InputStream inputStream= this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml");
        sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void testFindAll(){

        UserDao userDao=new UserDaoImpl(sqlSessionFactory);
        List<User> userList=userDao.findAll();
        for (User user : userList) {
            System.out.println("testtetet===="+user);
        }

    }

    @Test
    public void testSave(){
       UserDao userDao= new UserDaoImpl(sqlSessionFactory);
       User user=new User();
       user.setUsername("小米");
       user.setPassword("ddd123");
       user.setName("xiaopmi");
       user.setBirthday(new Date());
       userDao.save(user);
    }
}
