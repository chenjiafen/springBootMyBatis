package com.chenjiafneg.file;


import java.io.File;

/**
 * @author tyler.chen
 * @data 2019-12-17 23:32
 */
public class TestDemo02 {
    public static void main(String[] args) {
        //获取绝对路径
      File f=  new File("//Users//Data//axis.log");
        System.out.println(f.getAbsolutePath());

        //获取相对位置
      File f01=  new File("aaa.java");
        System.out.println(f01.getAbsolutePath());

    }
}
