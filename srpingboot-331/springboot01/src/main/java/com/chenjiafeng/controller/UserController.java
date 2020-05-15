package com.chenjiafeng.controller;

import com.chenjiafeng.mapper.UserMapper;
import com.chenjiafeng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:    UserController
 * Package:    com.chenjiafeng.controller
 * Description:
 * Datetime:    2020-01-16   00:42
 * Author:   tyler.chen
 */

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/list")
    public List<User> getUserLiset(){
      return   userMapper.getUserList();
    }
}
