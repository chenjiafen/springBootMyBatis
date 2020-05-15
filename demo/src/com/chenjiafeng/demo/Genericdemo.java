package com.chenjiafeng.demo;

import java.util.ArrayList;

/**
 * @ClassName Genericdemo
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/2/4
 * @Version V1.0
 * 泛行
 **/
public class Genericdemo {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("你哈");
        arrayList.add("itcat");
        arrayList.add(5);  //由于集合未做任何限制
    }
}

