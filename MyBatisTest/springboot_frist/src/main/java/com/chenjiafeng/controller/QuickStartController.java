package com.chenjiafeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:    QuickStartController
 * Package:    com.chenjiafeng.controller
 * Description:
 * Datetime:    2020-01-15   14:20
 * Author:   tyler.chen
 */

@Controller
public class QuickStartController {
    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){
        return "springboot 访问成功";

    }
}
