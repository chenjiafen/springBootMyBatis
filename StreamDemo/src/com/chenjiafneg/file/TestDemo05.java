package com.chenjiafneg.file;

import java.io.File;
import java.lang.reflect.Field;

/**
 * @author tyler.chen
 * @data 2019-12-18 00:06
 */
public class TestDemo05 {
    /**
     * 目录的遍历 public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
     * public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
     *
     * @param args
     */
    public static void main(String[] args) {
        File f = new File("/Users/Data/workspace/StreamDemo");
        //获取当前目录下的所有文件和目录
        String[] names = f.list();
        for (String name : names) {
            System.out.println(name);
        }

        //获取当前目录下的文件和目录对象
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}
