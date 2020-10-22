package com.example.demo.lamada.test3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:02 2020/10/22
 */
public class Method4 {
    public static void main(String[] args) {
        Supplier<List> supplier = () -> new ArrayList();
        System.out.println(supplier.get());

        Supplier<List> supplier2 = ArrayList::new;
        System.out.println(supplier2.get());
    }
}
