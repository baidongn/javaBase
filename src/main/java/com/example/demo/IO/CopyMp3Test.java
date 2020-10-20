package com.example.demo.IO;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.io.*;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 17:21 2020/10/19
 */
public class CopyMp3Test {
    public static void main(String[] args) throws IOException {
        copy_3();
    }

    //最沒有效率的，千万不要用
    public static void copy_4() throws IOException {
        FileInputStream inputStream = new FileInputStream("demo.txt");
        FileOutputStream outputStream = new FileOutputStream("demo1.txt");
        int ch = 0;
        while ((ch = inputStream.read()) != -1) {
            outputStream.write(ch);
        }
        outputStream.close();
        inputStream.close();
    }


    public static void copy_3() throws IOException {
        FileInputStream inputStream = new FileInputStream("demo.txt");
        FileOutputStream outputStream = new FileOutputStream("demo1.txt");
        byte[] buff = new byte[inputStream.available()];
        inputStream.read(buff);
        outputStream.write(buff);

        outputStream.close();
        inputStream.close();
    }

    public static void copy_2() throws IOException {
        FileInputStream inputStream = new FileInputStream("demo.txt");
        BufferedInputStream bufis = new BufferedInputStream(inputStream);
        FileOutputStream outputStream = new FileOutputStream("demo1.txt");
        BufferedOutputStream bufos = new BufferedOutputStream(outputStream);

        int ch = 0;
        while ((ch = bufis.read()) != -1) {
            bufos.write(ch);
        }
        bufos.close();
        bufis.close();
    }

    public static void copy_1() throws IOException {
        FileInputStream fis = new FileInputStream("demo.txt");
        FileOutputStream fos = new FileOutputStream("demo1.txt");
        byte[] buf = new byte[1024];
        int len = 0;
        while((len=fis.read(buf))!=-1){
            fos.write(buf,0,len);
        }
        fos.close();
        fis.close();
    }

}
