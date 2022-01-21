package com.example.learnalgorithm.common;

import java.util.Random;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 19:22 2022/1/1
 */
public class ArrayGenerator {

    //构造函数私有
    private ArrayGenerator() {

    }

    public static Integer[] generateOrderArray(int n) {

        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;

        }
        return arr;


    }

    ;


    /**
     *
     * @param n      数组长度
     * @param bound  数组最大范围  前闭后开
     * @return
     */
    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];

        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(bound);  //bound  最大值 前闭后开
        }
        return arr;


    }


}
