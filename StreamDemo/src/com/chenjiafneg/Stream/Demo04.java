package com.chenjiafneg.Stream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author tyler.chen
 * @data 2019-12-18 15:04
 */
public class Demo04 {
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 字符串转换为字节数组
        byte[] b = "abcde".getBytes();
        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b,2,2);
        // 关闭资源
        fos.close();

    }
}
