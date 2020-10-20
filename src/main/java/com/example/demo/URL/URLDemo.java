package com.example.demo.URL;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * @Author： bd
 * @Description:  反射
 * @Date: Created in 9:07 2020/10/20
 */
public class URLDemo {
    public static void main(String[] args) throws IOException {
        String STR_URL = "https://www.baidu.com/s?ie=UTF-8&wd=%E7%99%BE%E5%BA%A6";
        URL url = new URL(STR_URL);
        /*
         参数
         */
//        System.out.println("getProtocol:" + url.getProtocol());
//        System.out.println("getHost:" + url.getHost());
//        System.out.println("getPort:" + url.getPort());
//        System.out.println("getFile:" + url.getFile());
//        System.out.println("getPath:" + url.getPath());
//        System.out.println("getQuery:" + url.getQuery());

//        InputStream in = url.openStream();
//获取url对象的Url连接器对象。将连接封装成了对象:java中内置的可以解析的具体协议的对象+socket.
        URLConnection conn = url.openConnection();
//        String value = conn.getHeaderField("Content-Type");
//        System.out.println(value);
//        System.out.println(conn);
//读取页面信息
        InputStream in = conn.getInputStream();
        byte[] buf = new byte[1024];
        int len = in.read(buf);
        String text = new String(buf, 0, len);
        System.out.println(text);
        in.close();
    }
}
