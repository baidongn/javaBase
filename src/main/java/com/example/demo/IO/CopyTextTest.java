package com.example.demo.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:42 2020/10/13
 */
public class CopyTextTest {
    public static void main(String[] args) throws IOException {
        //1,读取一个已有的文本文件，使用字符读取流和文件相关联
        FileReader fileReader = new FileReader("demo.txt");

        //2,创建一个目的，用于存储读到数据。
        FileWriter fileWriter = new FileWriter("demo2.txt");

        //3,频繁的读写操作。
        int ch = 0;
        while ((ch = fileReader.read()) != -1) {
            fileWriter.write(ch);
        }

        //4.关闭流资源。
        fileReader.close();
        fileWriter.close();


    }


}
