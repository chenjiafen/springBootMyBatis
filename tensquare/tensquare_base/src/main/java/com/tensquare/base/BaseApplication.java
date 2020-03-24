package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import util.IdWorker;

/**
 * @ClassName BaseApplication
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/3/24
 * @Version V1.0
 **/

@SpringBootApplication
@EnableTransactionManagement
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class);
    }
    @Bean
    public IdWorker idWorker(){
      return new IdWorker(1,1)  ;
    }
}
