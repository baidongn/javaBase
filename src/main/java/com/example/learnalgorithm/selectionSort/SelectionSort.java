package com.example.learnalgorithm.selectionSort;

import com.example.learnalgorithm.common.SortingHelper;
import com.example.learnalgorithm.common.ArrayGenerator;

/**
 * @Author： bd
 * @Description: 选择排序   O（n^2）
 * @Date: Created in 15:05 2022/1/4
 */
public class SelectionSort {

    private SelectionSort() {

    }

    public static void sort(int[] arr) {

        //操作同一个数组  arr[0,i) 是有序的   arr[i,n)是无序的   维持一个循环不变量
        for (int i = 0; i < arr.length; i++) {

            // 选择arr【i，n）区间取最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                //找出最小值 对值进行比较
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //索引从0开始的
            swap1(arr, i, minIndex);
        }

    }

    private static void swap1(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] n = {10000,100000};
        for (int j : n) {

            Integer[] arr = ArrayGenerator.generateRandomArray(j, j);
            SortingHelper.sortTest("SelectionSort",arr);

        }


//        for (int i = 0; i < arr.length; i++) {
//
//            System.out.print(arr[i]+" ");
//
//        }
//        System.out.println("  ");

    }


    //###############泛型表示###############################

    //进行约束，泛型E类实现了Comparable接口 ： 比较的语法
    public static <E extends Comparable<E>> void sort(E[] arr) {

        //操作同一个数组  arr[0,i) 是有序的   arr[i,n)是无序的   维持一个循环不变量
        for (int i = 0; i < arr.length; i++) {

            // 选择arr【i，n）区间取最小值的索引
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                //找出最小值 对值进行比较
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            //索引从0开始的
            swap(arr, i, minIndex);
        }

    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

}
