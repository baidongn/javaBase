package com.example.learnalgorithm.linearSearch;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:30 2021/12/30
 */
public class LinearSearch {

    public int search(int[] date, int target) {
        for (int i = 0; i < date.length; i++) {
            if (target==date[i]) {
                return i;
            }
        }
        return -1;
    }
}
