package com.example.learnalgorithm.common;

import com.example.learnalgorithm.insertionSort.InsertionSort;
import com.example.learnalgorithm.selectionSort.SelectionSort;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 16:07 2022/1/4
 */
public class SortingHelper {

    private SortingHelper() {
    }

    public static <E extends Comparable> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable> void sortTest(String sortname, E[] arr) {
        long start = System.nanoTime();
//        Integer[] arr = {1, 2, 3, 6, 5, 4};
        if (sortname.equals("SelectionSort")) {
            SelectionSort.sort(arr);
        } else if (sortname.equals("InsertionSort")) {
            InsertionSort.sort(arr);

        }

        long end = System.nanoTime();
        //希望结果是一个浮点数，所以有 .0
        double time = (end - start) / 1000000000.0;
        if (!SortingHelper.isSorted(arr)) {
            throw new RuntimeException(sortname+" failed");
        }
        System.out.println(String.format("%s , n= %d : %fs", sortname, arr.length, time));

    }

}
