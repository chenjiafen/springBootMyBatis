package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

/**
 * ClassName:    MySpringBootAoolication
 * Package:    com
 * Description:
 * Datetime:    2020-01-15   14:22
 * Author:   tyler.chen
 */


//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@SpringBootApplication
public class MySpringBootAoolication {
    public static void main(String[] args) {
        SpringApplication.run(MySpringBootAoolication.class);
    }
}
