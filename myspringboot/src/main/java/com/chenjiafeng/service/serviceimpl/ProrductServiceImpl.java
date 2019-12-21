package com.chenjiafeng.service.serviceimpl;

import com.chenjiafeng.domain.Product;
import com.chenjiafeng.service.ProrductService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

/**
 * @author tyler.chen
 * @data 2019-11-21 14:03
 */

public class ProrductServiceImpl implements ProrductService {

    SqlSessionFactory sqlSessionFactory = null;

    public void init() {
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("sqlConfig.xml"));
    }

    @Override
    public List<Product> finAll() {
       SqlSession sqlSession= sqlSessionFactory.openSession();
        List<Product> productList=sqlSession.selectList("productMapper.findAll");

        return productList;
    }
}
