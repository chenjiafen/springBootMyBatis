package com.chenjiafeng.mapper;

import com.chenjiafeng.domain.User;

import java.util.List;

/**
 * ClassName:    UserMapper
 * Package:    com.chenjiafeng.mapper
 * Description:
 * Datetime:    2020-01-16   11:45
 * Author:   tyler.chen
 */
public interface UserMapper {
    public List<User> queryUser();
}
