package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author tyler.chen
 * @data 2019-12-22 23:20
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "testParam",method = RequestMethod.POST)
    public String testParam(String username,Integer age,Character sex){
        System.out.println(username+"\r\n"+age+"\r\n"+sex);
        return "show";
    }

    @RequestMapping(value = "/saveUser",method = RequestMethod.POST)
    public String saveUser(User user){
        System.out.println(user);
        return "show";
    }

}
