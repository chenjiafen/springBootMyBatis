package com.itheima;

import com.itheima.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 测试增删改查
 */

public class TestMybatiesCURD {

    @Test
    public void testFindAll(){

        //获取输入流对象
        InputStream inputStream= this.getClass().getClassLoader().getResourceAsStream("sqlMapConfig.xml");

        //获取SqlSessFactory(sqlsessiond的工厂类)的对象

        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

        //获取Sqlsession对象
       SqlSession sqlSession= sqlSessionFactory.openSession();

       //执行查询（userMapper--->namespaced的，findAll-->id）
      List<User> userList= sqlSession.selectList("userMapper.findAll");
      for (User users:userList){
          System.out.println(users);
      }
        //关闭资源
        sqlSession.close();

    }


}
