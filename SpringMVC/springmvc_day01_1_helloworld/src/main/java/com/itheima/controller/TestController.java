package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tyler.chen
 * @data 2019-12-22 01:14
 */

@Controller
public class TestController {

    @RequestMapping("/test")
    public void test(){
        System.out.println("测试成功");
    }
}
