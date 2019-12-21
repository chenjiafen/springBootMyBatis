package com.chenjiafneg.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author tyler.chen
 * @data 2019-12-18 15:42
 */
public class Demo05 {
    /**
     * ### 数据追加续写
     * public FileOutputStream(File file, boolean append) ： 创建文件输出流以写入由指定的 File对象表示的文件。
     * public FileOutputStream(String name, boolean append) ： 创建文件输出流以指定的名称写入文件。
     * @author tyler.chen
     *
     */
    public static void main(String[] args) throws IOException {
        // 使用文件名称创建流对象
        FileOutputStream fos = new FileOutputStream("fos.txt" ,true);
        // 字符串转换为字节数组
        byte[] b = "abcde".getBytes();
        // 写出从索引2开始，2个字节。索引2是c，两个字节，也就是cd。
        fos.write(b);
        // 关闭资源
        fos.close();
    }
}
