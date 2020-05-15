package com.chenjaifeng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * @author tyler.chen
 * @data 2020-01-06 15:17
 */
public class TestDemo {
    @Test
    public void init(){
        System.out.println("test01");
    }
    @BeforeClass
    public void test(){
        System.out.println("tetetasd");
    }
}
