package com.example.algorithm;

import sun.awt.SunHints;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 13:34 2021/6/22
 */
public class 单词间逆序 {

    public static void main(String[] args) {

        System.out.println( reverseBetweenWords("123"));
    }

    /*** 在单词间做一个逆序，但单词内不做逆序
     * * "dog loves pig" -> "pig loves dog"
     * * 算法： * 1）将整个字符串逆序
     * * 2）对每个单词再做逆序 ** @return
     * */

    public static String reverseBetweenWords(String str) {
        //拷贝一份
        char[] chars = new char[str.length()];
        System.arraycopy(str.toCharArray(), 0, chars, 0, str.length());
        //将字符串翻转
        reverse(chars, 0, chars.length - 1);

        //单个字符串修改
        int low = 0;
        for (int i = 0; i < str.length(); i++) {

            if (Character.isWhitespace(chars[i])) {
                reverse(chars, low, i - 1);
                low = i + 1;

            } else if (i == chars.length - 1) {
                reverse(chars, low, chars.length - 1);

            }

        }
        return new String(chars);
    }


    /**
     *
     * @param chars   数组
     * @param low     第一个下标
     * @param high    最后一个下标
     */
    public static void reverse(char[] chars, int low, int high) {
        assert low <= high;
        int length = high - low + 1;
        char temp;
        //重点在 length/2
        for (int i = 0; i < length / 2; i++) {
            temp = chars[i + low];
            //移动位数 low+i    high-i
            chars[i+low] = chars[high-i];
            chars[high - i] = temp;
        }
    }


}
