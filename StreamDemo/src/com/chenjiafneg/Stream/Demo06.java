package com.chenjiafneg.Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author tyler.chen
 * @data 2019-12-18 17:06
 */
public class Demo06 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        // 定义字节数组  
        byte[] words = {97, 98, 99, 100, 101};
        for (int i = 0; i < words.length; i++) {
            fos.write(words[i]);
            fos.write("\r".getBytes());
        }
        fos.close();
    }
}
