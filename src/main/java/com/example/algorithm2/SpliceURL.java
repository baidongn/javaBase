package com.example.algorithm2;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:06 2022/7/4
 */

import java.util.Scanner;

/**
 * 给定一个URL前缀和URL后缀，通过","分割，需要将其连接为一个完整的URL，如果前缀结尾和后缀开头都没有“/”，需自动补上“/”连接符，如果 前缀结尾和后缀开头都为“/”，需自动去重。
 * 约束：不用考虑前后缀URL不合法情况。
 * 1 /a   /b   /a/b
 * 2 /a   b   /a/b
 * 3 a   b   /a/b
 * 4       /
 */
public class SpliceURL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        splicingArray(str);


    }


    private static void splicingArray(String str) {

        if (str.trim().length() == 0) {
            System.out.println("/");
            return;
        }
        String[] split = str.split(",");
        if (split.length == 0) {
            System.out.println("/");
            return;
        }
        String prefix = split[0];
        String suffix = split[1];
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("/");
        stringBuffer.append(prefix);
        stringBuffer.append("/");
        stringBuffer.append(suffix);
        System.out.println(stringBuffer.toString().replaceAll("/+", "/"));


    }


}
