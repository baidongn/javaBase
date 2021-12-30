package com.example.algorithm;

/**
 * @Author： bd
 * 参数字符串是否是当前字符串的旋转词
 * 旋转词指的是各个字符的相对顺序不变，但是位置不同的字符串
 * 比如 123,231,312 * 最优解算法为 O(n)
 * 算法：
 * 1）比较长度是否相同
 * 2）如果相同，生成 str1+str1 的大字符串
 * 3）用 contains 或者 KMP 算法判断大字符串中是否包含 str2 *
 * @Description:
 * @Date: Created in 11:22 2021/6/22
 */
public class 旋转词 {

    public boolean isRotationWord(String a, String b) {

        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        String a1 = a + a;
        return a1.contains(b);

    }


}
