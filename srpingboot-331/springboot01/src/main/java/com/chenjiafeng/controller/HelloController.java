package com.chenjiafeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:    HelloController
 * Package:    com.chenjiafeng.controller
 * Description:
 * Datetime:    2020-01-15   21:09
 * Author:   tyler.chen
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world";
    }

}
