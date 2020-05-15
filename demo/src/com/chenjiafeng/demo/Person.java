package com.chenjiafeng.demo;

/**
 * @ClassName Person
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/2/4
 * @Version V1.0
 **/
public class Person {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p);
    }
}
