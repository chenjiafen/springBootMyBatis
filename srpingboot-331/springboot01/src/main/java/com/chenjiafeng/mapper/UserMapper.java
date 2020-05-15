package com.chenjiafeng.mapper;

import com.chenjiafeng.pojo.User;

import java.util.List;

/**
 * ClassName:    UserMapper
 * Package:    com.chenjiafeng.mapper
 * Description:
 * Datetime:    2020-01-15   21:37
 * Author:   tyler.chen
 */
public interface UserMapper {
    List<User> getUserList();
}
