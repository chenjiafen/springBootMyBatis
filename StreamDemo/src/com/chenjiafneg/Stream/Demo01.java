package com.chenjiafneg.Stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author tyler.chen
 * @data 2019-12-18 14:51
 */
public class Demo01 {
    /**
     * public FileOutputStream(File file) ：创建文件输出流以写入由指定的 File对象表示的文件。
     *  public FileOutputStream(String name) ： 创建文件输出流以指定的名称写入文件。
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        /**
         * 当你创建一个流对象时，必须传入一个文件路径。该路径下，如果没有这个文件，会创建该文件。如果有这个文
         *件，会清空这个文件的数据。
         */
        // 使用File对象创建流对象
        File file = new File("a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        // 使用文件名称创建流对象
        FileOutputStream fos01 = new FileOutputStream("b.txt");
    }
}
