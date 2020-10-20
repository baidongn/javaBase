package com.example.demo.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:36 2020/10/13
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("demo2.txt");
        //为了提高写入的效率。使用了字符流的缓冲区。
        //创建了一个字符写入流的缓冲区对象，并和指定要被缓冲的流对象相关联
        BufferedWriter bufw = new BufferedWriter(fileWriter);

        for (int i = 0; i < 5; i++) {
            bufw.write("abcdef"+i);
            bufw.newLine();
            bufw.flush();
        }
        bufw.close();

        //使用缓冲区的写入方法将数据先写入到缓冲区中。
//        bufw.write("abcdefq"+"hahahha");
//        bufw.write("xixiixii");
//        bufw.newLine();
//        bufw.write("heheheheh");
//        bufw.flush();
//        bufw.close();
    }
}
