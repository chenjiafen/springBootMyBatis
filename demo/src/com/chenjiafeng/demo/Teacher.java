package com.chenjiafeng.demo;

/**
 * @ClassName Teacher
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/2/2
 * @Version V1.0
 **/
public class Teacher extends Employee {
    public  void printName(){
        System.out.println("name:"+name);
    }

    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.name="xiaoming";
//        t.printName();
        t.work();
    }

}
