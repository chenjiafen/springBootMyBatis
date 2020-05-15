package com.itheima;

import com.itheima.dao.IUserDao;
import com.itheima.domain.User;
import com.itheima.domain.QueryVo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName:    MybatisTest
 * Package:    com.itheima
 * Description:
 * Datetime:    2020-01-08   17:32
 * Author:   tyler.chen
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlConfig.xml");
        //2.创建 SqlSessionFactory 的构建者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3.使用构建者创建工厂对象
        SqlSessionFactory SqlSessionFactory = builder.build(in);
        //4.使用 SqlSessionFactory 生产 SqlSession 对象
        SqlSession session = SqlSessionFactory.openSession();
        //5.使用 SqlSession 创建 dao 接口的代理对象
        IUserDao userDao = session.getMapper(IUserDao.class); //6.使用代理对象执行查询所有方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        session.close();
        in.close();
    }

    SqlSessionFactory sqlSessionFactory;

    @Before
    public void init() {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml"));
    }

    @Test
    public void testFindAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
        List<User> userList = userDao.findAll();
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void testFindById() {
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        User user = userDao.findByiId(2);
        System.out.println(user);


    }

    @Test
    public void testSaveUser() {
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        User user = new User();
        user.setUsername("modify User property");
        user.setAddress("北京市顺义区");
        user.setSex("男");
        user.setBirthday(new Date());
        System.out.println("保存操作之前:" + user);

        userDao.saveUser(user);
        session.commit();
        System.out.println("保存操作之后:" + user);

        session.close();
    }

    @Test
    public void testUpdateUser() {
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        User user = userDao.findByiId(4);
        user.setUsername("wangwu");
        user.setAddress("深圳市南山区");
        int res = userDao.updateUser(user);
        session.commit();
        System.out.println(res);
    }

    @Test
    public void testDeleteUser() {
        SqlSession session = sqlSessionFactory.openSession(true);
        IUserDao userDao = session.getMapper(IUserDao.class);
        int res = userDao.deleteUser(4);
//        session.commit();
        System.out.println(res);
    }

    @Test
    public void testFindByName() {
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        List<User> userList = userDao.findByName("%王%");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindByName02() {
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        List<User> userList = userDao.findByName("王");
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void testFindTotal() {
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        int res = userDao.findTotal();
        System.out.println(res);

    }

    @Test
    public void testFindByQueryVo() {
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        QueryVo vo = new QueryVo();
        User user = new User();
        user.setUsername("%王%");
        vo.setUser(user);
        List<User> users = userDao.findByVo(vo);
        for (User u : users) {
            System.out.println(u);
        }

    }

    @Test
    public void testFindByUser() {

        SqlSession session = sqlSessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        User u = new User();
        u.setUsername("%王%");
        u.setAddress("%顺义%");

       List<User> userList= userDao.findByUser(u);
        for (User user : userList) {
            System.out.println(user);
        }
    }
    @Test
    public  void testFindInIds(){
        SqlSession session = sqlSessionFactory.openSession();
        IUserDao userDao = session.getMapper(IUserDao.class);
        QueryVo vo = new QueryVo();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        ids.add(5);
        vo.setIds(ids); //6.执行操作
        List<User> users = userDao.findInIds(vo); for(User user : users) {
            System.out.println(user); }
    }

}

