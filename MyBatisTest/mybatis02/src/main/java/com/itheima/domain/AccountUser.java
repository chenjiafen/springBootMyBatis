package com.itheima.domain;

import java.io.Serializable;

/**
 * 为了能够封装上面 SQL 语句的查询结果，定义 AccountCustomer 类中要包含账户信息同时还要包含用户信 息，所以我们要在定义 AccountUser 类时可以继承 Account 类。
 * ClassName:    AccountUser
 * Package:    com.itheima.domain
 * Description:
 * Datetime:    2020-01-14   14:32
 * Author:   tyler.chen
 */

public class AccountUser extends Account implements Serializable {
    private String username;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "AccountUser{" +
                "username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
