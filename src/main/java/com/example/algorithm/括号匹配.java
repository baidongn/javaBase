package com.example.algorithm;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 11:28 2021/6/24
 */
public class 括号匹配 {
    /**
     * 字符串中只有左右小括号，判断是否匹配。
     * 可以用栈，也可以不用。
     * 设置一个变量 num：、
     * 遍历字符串
     * 1）遇到左括号，num++
     * 2）遇到右括号，num--，
     * 如果 num<0，返回 false
     * 3）遍历完后，num 为 0，返回 true，否则返回 false 时间复杂度为 O(n)
     */

    public static void main(String[] args) {
        System.out.println(isBracketMatch("()()()()((()))"));
    }

    public static boolean isBracketMatch(String str) {
        int num = 0;

        for (Character c : str.toCharArray()) {
            if (c == '(') {
                num++;
            } else if (c == ')') {
                num--;
                if (num < 0) {
                    return false;
                }


            }
        }
        return num == 0;
    }

}
