package com.example.demo.lamada.test3;

import java.util.Arrays;
import java.util.function.Function;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:08 2020/10/22
 */
public class Method5 {
    public static void main(String[] args) {
        Function<Integer, String[]> function = l -> new String[l];
        System.out.println(Arrays.toString(function.apply(5)));

        Function<Integer, String[]> function2 = String[]::new;
        System.out.println(Arrays.toString(function2.apply(2)));
    }
}
