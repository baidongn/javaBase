package com.example.demo.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:08 2020/10/13
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("demo.txt");
        BufferedReader bufr = new BufferedReader(fileReader);
        //BufferedReader 有读取一行数据
        String line = null;

        while ((line = bufr.readLine()) != null) {
            System.out.println(line);
        }
        //java中关闭1个处理流, 会自动调用处理流包裹的原始流的close()方法, 也就是说回嵌套地关闭流, 所以只需要关闭缓冲流, 不需关闭原始流
        bufr.close();
    }
}
