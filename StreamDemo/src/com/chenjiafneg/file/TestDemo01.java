package com.chenjiafneg.file;

import java.io.File;

/**
 * @author tyler.chen
 * @data 2019-12-17 23:08
 */
public class TestDemo01 {
    /**
     *
     *  获取功能的方法
     * 	public String getAbsolutePath() ：返回此File的绝对路径名字符串。
     * 	public String getPath() ：将此File转换为路径名字符串
     * 	public String getName() ：返回由此File表示的文件或目录的名称。
     *  public long length() ：返回由此File表示的文件的长度
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        File f=new File("d:/aaa/bbb.java");
        System.out.println("文件绝对路径:"+f.getAbsolutePath());
        System.out.println("文件构造路径:"+f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");

        File f2= new File("d:/aaa");
        System.out.println("目录绝对路径:"+f2.getAbsolutePath());
        System.out.println("目录构造路径:"+f2.getPath());
        System.out.println("目录名称:"+f2.getName());
        System.out.println("目录长度:"+f2.length());
    }
}
