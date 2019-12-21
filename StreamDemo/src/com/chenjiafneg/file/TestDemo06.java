package com.chenjiafneg.file;

import java.io.File;

/**
 * @author tyler.chen
 * @data 2019-12-18 00:17
 * 文件搜索
 */

public class TestDemo06 {
    public static void main(String[] args) {
        File dir=  new File("/Users/Data/workspace/StreamDemo");
        printDir(dir);
    }
    public static void printDir(File dir){
      File[] files=  dir.listFiles();
      for (File file:files){
          if(file.isFile()){
              if (file.getName().endsWith(".java")){
                  System.out.println("文件名:" + file.getAbsolutePath());
              }

          }else {
              //  是目录，继续遍历,形成递归
              printDir(file);
          }

      }

    }
}
