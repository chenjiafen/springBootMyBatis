package FileTest;

import java.io.File;
import java.io.IOException;

/**
 * @author tyler.chen
 * @data 2019-12-10 13:46
 */
public class FileGet {
    /**
     * public File(String pathname)：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
     * public File(String parent, String child)：从父路径名字符串和子路径名字符串创建新的 File实例。
     * public File(File parent, String child)：从父抽象路径名和子路径名字符串创建新的 File实例。
     */


    public static void main(String[] args) throws IOException {
        FileGet fileGet = new FileGet();
        fileGet.test01();
        fileGet.test02();
        fileGet.test03();
    }

    /**
     * 文件名
     */
    public void test01() {
        String pathname = "aaa.txt";
        File file1 = new File(pathname);
        System.out.println(file1);
    }

    /**
     * 通过父路径和子路径字符串
     */
    public void test02() {
        String parent = "test";
        String child = "pom.xml";
        File file3 = new File(parent, child);
        System.out.println(file3);
    }

    public void test03() throws IOException {
        File f = new File("aaa.txt");
        System.out.println("是否存在:"+f.exists());// false
        System.out.println("是否创建:"+f.createNewFile());// true
        System.out.println("是否存在:"+f.exists()); // true
        // 目录的创建   
         File f2=new File("newDir");
         System.out.println("是否存在:"+f2.exists());// false
         System.out.println("是否创建:"+f2.mkdir()); // true
         System.out.println("是否存在:"+f2.exists());// true
        //  创建多级目录        
        File f3= new File("newDira\\newDirb");
        System.out.println(f3.mkdir());// false
         File f4=new File("newDira\\newDirb");
         System.out.println(f4.mkdirs());// true
        //  文件的删除  
         System.out.println(f.delete());// true
        //  目录的删除  
         System.out.println(f2.delete());// true
         System.out.println(f4.delete());// false
    }
}
