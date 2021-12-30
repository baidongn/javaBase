package com.example.algorithm;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:08 2021/6/28
 */
public class 第一个只出现一次的字符 {
    /*哈希表
     *因为哈希表大小与 str 的长度无关
     * 所以空间复杂度为 O(1)
     *  时间复杂度为 O(n)
     *
     * 如果需要创建哈希表，键值为 字符，值为 数字时，可以考虑用数组（length=256）来替代，数组下标表示为字符的ASCII码值
     *ASCII 码使用指定的7 位或8 位二进制数组合来表示128 或256 种可能的字符。
     *
     *
     */
    public static void main(String[] args) {

        System.out.println(appearOnceIndex("abcdabc"));

    }

    public static int appearOnceIndex(String str) {

        int[] map = new int[256];

        for (int i = 0; i < str.length() ; i++) {
            map[(int) str.charAt(i)] += 1;
        }

        for (int i = 0; i < str.length() ; i++) {
            if ((int) map[str.charAt(i)] == 1) return i;

        }


        return -1;
    }


}
