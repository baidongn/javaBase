package com.example.learnalgorithm.insertionSort;

import com.example.learnalgorithm.common.ArrayGenerator;
import com.example.learnalgorithm.common.SortingHelper;

/**
 * @Author： bd
 * @Description:  插入排序 O（n^2）    内层情况特殊（待在它应该带的位置）：O（n）  但是整体程度：插入排序 O（n^2）
 * @Date: Created in 10:40 2022/1/5
 */
public class InsertionSort {

    private InsertionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {

        for (int i = 0; i < arr.length; i++) {
            //将 arr[i] 插入到合适的位置
            //从i位置开始向前查找，符合条件就插入
//            for (int j = i; j - 1 >= 0; j--) {
//                if (arr[j].compareTo(arr[j - 1]) < 0) {
//                    //如果该元素比前一个小，就交换位置
//                    swap(arr, j, j - 1);
//                } else {
//                    break;
//                }
//            }

            //第二种写法
//            for (int j = i; (j - 1 >= 0) && (arr[j].compareTo(arr[j - 1]) < 0); j--) {
//                swap(arr, j, j - 1);
//            }

            //第三种  小优化（进行赋值 而不是 三次交换）   对程序的时间复杂度没有影响(数据量大 会产生较大影响，底层jvm优化/寻址有关)
            E t = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }

    private static <E> void swap(E[] arr, int i, int j) {
        E t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int[] n = {10000,100000};
        for (int j : n) {

            Integer[] arr = ArrayGenerator.generateRandomArray(j, j);
            SortingHelper.sortTest("InsertionSort",arr);

        }

    }

}
