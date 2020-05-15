package com.chenjiafeng.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


/**
 * @ClassName Iteratordemo
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/2/4
 * @Version V1.0
 **/
public class Iteratordemo {
    public static void main(String[] args) {
        Collection<String> coll= new ArrayList<String>();
        coll.add("串串星人");
        coll.add("吐槽星人");
        coll.add("汪星人");

        //遍历集合
       Iterator<String> it =coll.iterator();
       while(it.hasNext()){ //判断是否又迭代元素
         String s=  it.next();
           System.out.println(s);
       }
    }
}
