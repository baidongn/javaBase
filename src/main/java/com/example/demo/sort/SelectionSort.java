package com.example.demo.sort;

/**
 * @Author： bd
 * @Description: todo  选择排序
 * @Date: Created in 16:44 2022/3/7
 */
public class SelectionSort {

    /**
     * 1. 先以第一个为最小值 进行遍历剩余的数组，若有最小的 进行交换
     * 2.  每次左边为有序，右边无序,所以只需要遍历一次
     */

    public static void sort(int[] num) {

        for (int i = 0; i < num.length; i++) {
            int min = i;
            //选出之后待排序中值最小的位置
            for (int j = i + 1; j < num.length; j++) {
                if (num[min] > num[j]) {
                    min = j;
                }
            }
            //最小值不等于当前值时进行交换
            if (min != i) {
                int tmp = num[i];
                num[i] = num[min];
                num[min] = tmp;
            }

        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 3, 2, 4, 8};
        SelectionSort.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}
