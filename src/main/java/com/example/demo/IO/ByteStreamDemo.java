package com.example.demo.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 16:49 2020/10/19
 */
public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
//        demo_read();
        demo_write();
    }

    public static void demo_write() throws IOException {
        //1，创建字节输出流对象。用于操作文件.   true 對文件進行續寫
        FileOutputStream fos= new FileOutputStream("demo1.txt");
        fos.write("abcdefg".getBytes());
        fos.close();
    }

    public static void demo_read() throws IOException {
        //1. 创建一个读取流对象
        FileInputStream fis = new FileInputStream("demo.txt");

        /*方式一*/
//        System.out.println(fis.available());
//        byte[] buf = new byte[fis.available()];
//        fis.read(buf);
//        System.out.println(new String(buf));
        /*方式二 （推荐）*/
//        byte[] buff = new byte[1024];
//        int len = 0;
//        while ((len = fis.read(buff)) != -1) {
//            System.out.println(new String(buff, 0, len));
//        }

        /* 单个字节读取 */
        int ch = 0;
        while ((ch = fis.read()) != -1) {
            System.out.println((char) ch);

        }
        fis.close();

    }
}
