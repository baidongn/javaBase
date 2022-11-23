package com.example.algorithm2;

/**
 * @Author： bd
 * @Description: 输入一组数字，数字之间用空格隔开，判断输入的数字是否可以满足A=B+2C，每个元素最多只可用一次。若有满足的数字组合，依次输出A、B、C三个数字，之间用空格隔开；若无满足条件的组合，输出0。
 * @Date: Created in 13:46 2022/7/11
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 输入一组数字，数字之间用空格隔开，判断输入的数字是否可以满足A=B+2C，每个元素最多只可用一次。若有满足的数字组合，依次输出A、B、C三个数字，之间用空格隔开；若无满足条件的组合，输出0。
 */
public class DigitalCombination {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] nums = line.split(" ");

        digitalCombination(nums);
    }


    public static void digitalCombination(String[] nums) {

        Integer[] arr = new Integer[nums.length];

        //转为int
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(nums[i]);
        }


        //降序排列
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        //判定
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                for (int k = 0; k < arr.length; k++) {

                    if ((arr[i] == arr[j] + 2 * arr[k]) && (i != j && j != k && k != i)) {
                        index++;
                        System.out.println(arr[i] + " = " + arr[j] + " + 2 *" + arr[k]);
                    }
                }
            }
        }

        if (index == 0) {
            System.out.println(0);

        }


    }

}
