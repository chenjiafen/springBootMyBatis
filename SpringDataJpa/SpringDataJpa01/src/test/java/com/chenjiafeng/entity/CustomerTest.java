package com.chenjiafeng.entity;

import com.chenjiafeng.uitls.JpaUtil;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @ClassName CustomerTest
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/3/17
 * @Version V1.0
 **/
public class CustomerTest {
    @Test
    public void testAddCustomer() {
//     创建  EntityManagerFactory对象
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myjpa");
        //创建实体管理类
        EntityManager entityManager = factory.createEntityManager();
        /**
         *
         *getTransaction获取事务对象
         *
         * persist保存操作
         * merge：更新操作
         * remove：删除操作
         *find/getReference：根据id查询
         */
        //获取事务对象
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();//开启事务
        Customer customer = new Customer();
        customer.setCustName("张三");
        customer.setCustAddress("北京");
        customer.setCustIndustry("旅游");
        customer.setCustlevel("vip");
        customer.setCustPhone("18777665665");
        customer.setCustSource("网络");
        entityManager.persist(customer);//persist保存操作
        transaction.commit();//提交事务
        entityManager.close();
        factory.close();
    }
    @Test
    public void  addCustomer(){

        //获取EntityManager对象
        EntityManager entityManager=JpaUtil.getEntityManager();
        //获取事务对象
       EntityTransaction transaction= entityManager.getTransaction();

       //开启事务
        transaction.begin();

       Customer customer= new Customer();

    }
}
