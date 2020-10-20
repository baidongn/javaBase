package com.example.demo.IO;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:22 2020/10/13
 */
public class FileReaderDemo {

    public static void main(String[] args)   throws IOException {
        //1,创建读取字符数据的流对象。
        /*
         * 在创建读取流对象时，必须要明确被读取的文件。一定要确定该文件是存在的。
         *
         * 用一个读取流关联一个已存在文件。
         *
         * read()读取的是 char字符，
         */

        FileReader fileReader = new FileReader("demo.txt");
        int ch = 0;
        while ( (ch =fileReader.read() )!= -1) {
            System.out.println((char) ch);
        }
        fileReader.close();
    }
}
