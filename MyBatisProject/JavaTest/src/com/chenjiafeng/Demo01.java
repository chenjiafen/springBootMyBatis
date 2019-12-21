package com.chenjiafeng;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tyler.chen
 * @data 2019-12-03 22:24
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张无极");
        list.add("赵敏");
        list.add("周芷若");
        list.add("杨过");
        list.add("小龙女");

        list.stream()
                .filter(name->name.startsWith("张"))
                .filter(name->name.length()==3)
                .forEach(name->System.out.println(name));
    }
}
