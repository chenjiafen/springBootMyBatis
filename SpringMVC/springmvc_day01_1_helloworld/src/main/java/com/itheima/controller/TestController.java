package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author tyler.chen
 * @data 2019-12-22 01:14
 */

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/hello", method = RequestMethod.POST,params = {"name","age>20"})
    public String test() {
        System.out.println("测试成功");
        return "show";
    }
}
