package com.chenjiafneg.Stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author tyler.chen
 * @data 2019-12-18 14:59
 */
public class Demo03 {
    /**
     * 写出字节数组： write(byte[] b) ，每次可以写出数组中的数据
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 字符串转换为字节数组
        byte[] b = "我来贷不等待".getBytes();
        // 写出字节数组数据
        fos.write(b);
        // 关闭资源
        fos.close();
    }
}
