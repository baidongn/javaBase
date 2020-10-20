package com.example.demo.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:48 2020/10/13
 */
public class CopyTextTest_2 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            fileReader = new FileReader("demo.txt");
            fileWriter = new FileWriter("demo2.txt");

            //创建一个临时容器，用于缓存读取到的字符。
            char[] buf = new char[1024];

            //定义一个变量记录读取到的字符数，(其实就是往数组里装的字符个数 )
            int len = 0;
            while ((len = fileReader.read(buf)) != -1) {
                fileWriter.write(buf, 0, len);
            }


        } catch (IOException e) {
            throw new RuntimeException("读写失败");
        } finally {
            //先打开的后关闭，后打开的先关闭
//            先关外层，再关内层
            if (fileWriter != null)
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            if (fileReader != null)
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}

