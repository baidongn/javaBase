package com.example.demo.IO;


import java.io.FileReader;
import java.io.IOException;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:32 2020/10/13
 */
public class FileReaderDemo2 {
    public static void main(String[] args) {
        /*
         * 使用read(char[])读取文本文件数据。
         *
         * 先创建字符数组。
         *
         * len是读取长度
         */
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("pom.xml");
            char[] chars = new char[1024];
            int len = 0;
            while ((len = fileReader.read(chars)) != -1) {
                System.out.println(new String(chars, 0, len));
            }
            /*
            int num = fileReader.read(chars);//将读取到的字符存储到数组中。
            System.out.println(num+":"+new String(chars,0,num));
             */


        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭异常");
                }
            }

        }
    }
}
