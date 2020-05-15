package com.chenjiafeng.service;

import com.chenjiafeng.domain.Users;

import java.util.List;

/**
 * @author tyler.chen
 * @data 2020-01-06 17:45
 */
public interface UserService {
    List<Users> findAll();
    int insertUser(Users users);
    int deleteUser(Integer id);
    Users findByid(Integer id);
    int updateUser(Users users);
}
