package com.chenjiafneg.file;

import java.io.File;
import java.io.IOException;

/**
 * @author tyler.chen
 * @data 2019-12-17 23:50
 */
public class TestDemo04 {
    /**
     * 创建删除功能的方法
     * public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
     * public boolean delete() ：删除由此File表示的文件或目录。
     * public boolean mkdir() ：创建由此File表示的目录。
     * public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //文件的创建
        File f=new File("bbb.txt");
        System.out.println("是否存在"+f.exists());
        System.out.println("是否创建"+f.createNewFile());

        //目录的创建
        File f2= new File("newDir");
        System.out.println("目录是否存在"+f2.exists());
        System.out.println("是否创建目录"+f2.mkdir());
        System.out.println("目录是否存在"+f2.exists());

        //创建多级目录
       File f3= new File("DIR/nweDir");
        System.out.println("目录是否存在："+f3.exists());
        System.out.println("是否创建？"+f3.mkdir());
        System.out.println("是否创建？"+f3.mkdirs());


        //文件删除
        System.out.println(f.delete());

        //删除目录
        System.out.println(f2.delete());



    }
}
