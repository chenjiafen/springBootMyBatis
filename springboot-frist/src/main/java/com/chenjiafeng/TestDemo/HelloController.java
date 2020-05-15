package com.chenjiafeng.TestDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tyler.chen
 * @data 2020-01-07 17:49
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        String s="Hello world";
        return s;
    }
}
