package com.example.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:50 2021/6/24
 */
public class 变形词 {
    /*** 变形词：两个字符串，如果出现的字符是一样的并且每个字符出现次数一样，则返回 true； 否则返回 false。
     *
     *
     * 比如"abc" "bca" * 哈希表，字符统计 * 可以使用定长数组来取代哈希表，时间复杂度为 O(n)，空间复杂度为 O(n)。
     * char -> 使用长度为 256 的数组
     */
    public static void main(String[] args) {
        System.out.println(isTransferWord("abc", "bcaa"));

    }

    public static boolean isTransferWord(String str1, String str2) {

        HashMap<Character, Integer> str1HashMap = new HashMap<>();
        for (char c : str1.toCharArray()) {
            if (!str1HashMap.containsKey(c)) {
                str1HashMap.put(c, 1);
            } else {
                str1HashMap.put(c, str1HashMap.get(c)+1);
            }

        }

        HashMap<Character, Integer> str2HashMap = new HashMap<>();
        for (char c : str2.toCharArray()) {
            if (!str2HashMap.containsKey(c)) {
                str2HashMap.put(c, 1);
            } else {
                str2HashMap.put(c, str2HashMap.get(c)+1);
            }
        }

        if (str1HashMap.size() != str2HashMap.size()) {
            return false;
        }

        for (Map.Entry<Character, Integer> entry : str1HashMap.entrySet()) {
            if (entry.getValue().compareTo(str2HashMap.get(entry.getKey())) != 0) {
                return false;
            }
        }
        return true;
    }


}
