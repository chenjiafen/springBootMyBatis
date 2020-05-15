package com.itheima.dao;

import com.itheima.domain.AccountUser;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * ClassName:    IAccountDaoTest
 * Package:    com.itheima.dao
 * Description:
 * Datetime:    2020-01-14   14:45
 * Author:   tyler.chen
 */
public class IAccountDaoTest {
    private SqlSessionFactory sqlSessionFactory;
    private SqlSession sqlSession;
    private IAccountDao accountDao;

    @Before
    public void init() {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml"));
    }

    @Test
    public void tesdFindAll() {
        sqlSession = sqlSessionFactory.openSession();
        accountDao = sqlSession.getMapper(IAccountDao.class);
        List<AccountUser> accountUserList = accountDao.findAll();
        for (AccountUser accountUser : accountUserList) {
            System.out.println(accountUser);
        }

    }

    @After//在测试方法执行完成之后执行
    public void destroy() throws Exception {
        sqlSession.commit(); //7.释放资源
        sqlSession.close();
    }
}
