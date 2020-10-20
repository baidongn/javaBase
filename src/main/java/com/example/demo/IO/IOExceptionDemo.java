package com.example.demo.IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:13 2020/10/13
 */
public class IOExceptionDemo {
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("demo.txt");
            fw.write("dfafbskabd");
            fw.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            if (null != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException("关闭失败");
                }
            }

        }


    }
}
