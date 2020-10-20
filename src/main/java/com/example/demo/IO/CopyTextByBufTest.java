package com.example.demo.IO;

import java.io.*;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:41 2020/10/13
 */
public class CopyTextByBufTest {



    public static void main(String[] args) {
        BufferedReader bufr = null;
        BufferedWriter bufw = null;

        try {
            bufr = new BufferedReader(new FileReader("demo.txt"));
            bufw = new BufferedWriter(new FileWriter("demo1.txt"));


            String line = null;
            while ((line = bufr.readLine()) != null) {
                bufw.write(line);
                bufw.newLine();
            }

            bufw.flush();
        } catch (Exception e) {
            throw new RuntimeException("读写失败");
        }finally {
            if (bufw != null) {
                try {
                    bufw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (bufr != null) {
                try {
                    bufr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }


}
