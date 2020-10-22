package com.example.demo.lamada.test2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Author： bd
 * @Description:  () - > return x ;
 * @Date: Created in 13:21 2020/10/22
 */
public class 提供型接口 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Supplier<Integer> supplier = () -> (int) (Math.random() * 10);
        list.add(supplier.get());
        list.add(supplier.get());
        list.add(supplier.get());

        System.out.println(list);
    }
}
