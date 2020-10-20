package com.example.demo.IO;

import java.util.ArrayList;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 17:48 2020/10/19
 */
public class Test13 {
    /*
    一个ArrayList对象alist中存有若干个字符串元素，现欲遍历该ArrayList对象，
    删除其中所有值为"abc"的字符串元素，请问下面的实现正确么？如有问题，
    会出现什么问题？如何更正？
     */

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("haha");
        alist.add("abc");
        alist.add("abc");
        alist.add("abc");

        /*
         *错误的方式
         */
//        int size = alist.size();
//        for (int i = 0; i < size; i++) {
//            if ("abc".equals(alist.get(i))) {
//                alist.remove(i);
//            }
//        }
        /*
         *正确的方式
         */
        for (int x = 0; x < alist.size(); x++) {
            if ("abc".equals(alist.get(x))) {
                alist.remove(x);
                //精髓！！！
                x--;
            }
        }
        System.out.println(alist);


    }
}
