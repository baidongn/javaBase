package com.example.demo.sort;

import java.util.Arrays;

/**
 * @Author： bd
 * @Description: 冒泡排序
 * @Date: Created in 16:29 2022/3/7
 */
public class BubbleSort {

    /**
     * 1. 外层循环  排序比较的次数
     * 2. 每一次排完序后 已经排过序的就不需要再进行排列
     * 3. 左右两边比较，如果左边大于右边 就进行交换；这样一个循环下来，可以筛选出最大的数字
     */

    public static void sort(int[] num) {

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int tmp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = tmp;
                }

            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {5, 3, 2, 4, 8};
        BubbleSort.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
