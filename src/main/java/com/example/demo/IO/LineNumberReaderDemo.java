package com.example.demo.IO;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 13:17 2020/10/13
 */
public class LineNumberReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        LineNumberReader lnr = new LineNumberReader(fr);
        String line = null;
//        lnr.setLineNumber(0);
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber() + ":" + line);
        }
        lnr.close();
    }
}
