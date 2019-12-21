package com.chenjiafeng.controller;

import com.chenjiafeng.domain.Product;
import com.chenjiafeng.service.ProrductService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tyler.chen
 * @data 2019-11-20 13:19
 */
@RestController
@RequestMapping("/v1")
public class ProductContoller {

    @Resource
    ProrductService prorductService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Product> findAll() {
        List<Product> productList=prorductService.finAll();

        return productList;
    }


    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "Hello Spring boot";
    }
}
