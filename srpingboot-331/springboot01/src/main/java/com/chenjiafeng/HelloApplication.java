package com.chenjiafeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName:    HelloApplication
 * Package:    com.chenjiafeng
 * Description:
 * Datetime:    2020-01-15   21:10
 * Author:   tyler.chen
 */

@SpringBootApplication
@MapperScan(basePackages = "com.chenjiafeng.mapper")
public class HelloApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class);
    }
}
