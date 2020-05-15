package com.chenjiafeng.demo;

/**
 * @ClassName Cat
 * @Description: TODO
 * @Author chenjiafeng
 * @Date 2020/2/2
 * @Version V1.0
 **/
public class Cat extends Animal {
    public void eat(){
        System.out.println("cat : eat");
    }
    public void eatTest(){
        this.eat(); //调用本类的方法
        super.eat(); //调用父类的方法
    }

    public static void main(String[] args) {
//        Animal a=new Animal();
//        a.eat();
//
        Cat C=new Cat();
//        C.eat();

        C.eatTest();

    }
}
