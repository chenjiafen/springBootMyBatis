package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @author tyler.chen
 * @date 2019/11/19 23:35
 */
public class UserDaoImpl implements UserDao {

    //所有的方法共用的factory对象，应该是应用级别的
    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public List<User> findAll() {
        //每一个方法应该获取一个sqlsession对象，用完就要关闭
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> user = sqlSession.selectList("userMapper.findAll");
        sqlSession.close();

        return user;
    }

    public void save(User user) {

        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("userMapper.save", user);
        sqlSession.commit();
        sqlSession.close();

    }

    public void update(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.update("userMapper.update",user);
        sqlSession.commit();
        sqlSession.close();
    }

    public void delete(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.delete("userMapper.delete",id);
        sqlSession.commit();
        sqlSession.close();

    }
}
