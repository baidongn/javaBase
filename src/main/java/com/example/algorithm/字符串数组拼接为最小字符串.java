package com.example.algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 13:18 2021/6/23
 */
public class 字符串数组拼接为最小字符串 {
    /*** 找到一种拼接顺序，使得拼接后的整个字符串的字典序最小
     * * 最优复杂度为 O(nlogn) * 实质上是一个排序
     * * 注意不能直接按字典序排序，比如["ba","b"] -> ["b","ba"] "bab" < "bba"
     * * 要这样排序：
     * * 如果 str1+str2 < str2+str1，那么 str1 < str2
     * * @param arr
     * * @return
     * */
    public static void main(String[] args) {
        String[] arr = {"ba", "b"};


        System.out.println(concatArrayToMinString(arr));
    }

    public static String concatArrayToMinString(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照字典顺序比较两个字符串，前者==后者，返回0.前者<后者 ,返回负数，否则，返回正数
                return (o1 + o2).compareTo(o2 + o1);
            }
        });

        StringBuilder builder = new StringBuilder();
        for (String str : arr) {
            builder.append(str);
        }
        return builder.toString();


    }

}
