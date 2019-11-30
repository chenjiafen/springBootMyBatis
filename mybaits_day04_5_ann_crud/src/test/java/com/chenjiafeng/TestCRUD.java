package com.chenjiafeng;

import com.chenjiafeng.dao.UserDao;
import com.chenjiafeng.daomain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/30 12:43
 */
public class TestCRUD {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("myybatis-config.xml"));
    }

    @Test
    public void testfindAllUser() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.findAllUser();
        for (User user : userList) {
            System.out.println("用户:"+user);
        }
        sqlSession.close();
    }
    @Test
    public void testfindUserById() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = userDao.findUserById(1);
       System.out.println("用戶"+user);
        sqlSession.close();
    }

    @Test
    public void testfindUserByUsername() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.findUserByUsername("雨");
        for (User user : userList) {
            System.out.println("用戶"+user);
        }
        sqlSession.close();
    }
    @Test
    public void testSave() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user=new User();
        user.setUsername("马云");
        user.setPassword("root123");
        user.setName("jack");
        user.setBirthday("1964.09.10");

        userDao.insertUser(user);
        sqlSession.commit();
        sqlSession.close();

    }
}
