package com.example.algorithm;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:37 2021/6/23
 */
public class 字符串循环左移 {

    /*** 比如"ABCDE",n=3 -> "DEABC"
     * * 时间复杂度为 O(n)，空间复杂度为 O(1)
     * * 做三次逆序：
     *
     * * 1)[0,len -1]逆序（前 n 个）
     * * 2)[len,N-1]逆序（剩下的）
     * * 3)[0,N-1]逆序（全部）
     * ** @param len * @return
     * */
    public static void main(String[] args) {

        System.out.println(leftShift("ABCDE",3));
    }

    public static String leftShift(String str, int len) {
        char[] chars = new char[str.length()];
        System.arraycopy(str.toCharArray(), 0, chars, 0, str.length());
        reverse(chars, 0, len - 1);
        reverse(chars, len, chars.length - 1);
        reverse(chars, 0 , chars.length - 1);
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
