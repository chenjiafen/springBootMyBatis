package com.chenjiafeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:    MyApplication
 * Package:    com.chenjiafeng
 * Description:
 * Datetime:    2020-01-16   13:48
 * Author:   tyler.chen
 */

@SpringBootApplication
@MapperScan("com.chenjiafeng.mapper")
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class);
    }
}
