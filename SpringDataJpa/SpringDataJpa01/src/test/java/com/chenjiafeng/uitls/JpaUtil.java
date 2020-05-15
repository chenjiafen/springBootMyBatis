package com.chenjiafeng.uitls;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @ClassName JpaUtil
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/3/19
 * @Version V1.0
 **/
public class JpaUtil {
    private static class EntityManagerFactoryHoler {
        //创建  EntityManagerFactory对象
        private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("myjpa");

        public static EntityManagerFactory getFactory() {
            return factory;
        }
    }
    //创建实体管理对象
    public static EntityManager getEntityManager(){
        return EntityManagerFactoryHoler.getFactory().createEntityManager();
    }
}
