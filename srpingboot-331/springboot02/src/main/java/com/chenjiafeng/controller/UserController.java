package com.chenjiafeng.controller;

import com.chenjiafeng.config.GirlProperties;
import com.chenjiafeng.domain.User;
import com.chenjiafeng.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName:    UserController
 * Package:    com.chenjiafeng.controller
 * Description:
 * Datetime:    2020-01-16   11:45
 * Author:   tyler.chen
 */
@Controller
//@RequestMapping("/user")
public class UserController {
    @Value("${cupSzie}")
    private String cupSize;

    @Value("${age}")
    private int age;

    @Value("${content}")
    private String contents;

//    读取配置文件
    @Autowired
    private GirlProperties girlProperties;

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<User> findAll() {
        List<User> userList = userMapper.queryUser();
        return userList;
    }

    @RequestMapping(value = "/getgril", method = RequestMethod.GET)
    @ResponseBody
    public String getGril() {
//        return age + cupSize;
        return contents;
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize();
    }

}
