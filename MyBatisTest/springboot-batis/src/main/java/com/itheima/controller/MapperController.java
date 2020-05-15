package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName:    MapperController
 * Package:    com.itheima.controller
 * Description:
 * Datetime:    2020-01-15   17:37
 * Author:   tyler.chen
 */

@Controller
public class MapperController {
    @Resource
    private UserMapper userMapper;

    @RequestMapping("/queryUser")
    @ResponseBody
    public List<User> queryUser(){
      List<User> userList=  userMapper.queryUserList();
      return  userList;
    }
}
