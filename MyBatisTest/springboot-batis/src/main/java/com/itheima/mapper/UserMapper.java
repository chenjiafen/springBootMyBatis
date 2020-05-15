package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

/**
 * ClassName:    UserMapper
 * Package:    com.itheima.mapper
 * Description:
 * Datetime:    2020-01-15   17:41
 * Author:   tyler.chen
 */


public interface UserMapper {
    public List<User> queryUserList();
}
