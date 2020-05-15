package com.chenjiafeng.mapper;

import com.chenjiafeng.domain.Users;

import java.util.List;

/**
 * @author tyler.chen
 * @data 2020-01-06 17:36
 */
public interface UserMapper {
    List<Users> findAll();
    int insertUser(Users users);
    int deleteUser(Integer id);
    Users findByid(Integer id);
    int updateUser(Users users);

}
