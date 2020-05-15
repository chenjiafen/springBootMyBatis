package com.chenjiafeng.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ClassName:    GirlProperties
 * Package:    com.chenjiafeng.config
 * Description:
 * Datetime:    2020-01-17   17:00
 * Author:   tyler.chen
 */


@Component
@ConfigurationProperties(prefix = "girl")//获取前缀是girl配置
public class GirlProperties {
    private String cupSize;
    private int age;

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
