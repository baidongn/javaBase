package com.example.demo.lamada.test;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 13:12 2020/10/22
 */
public class Test {
    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(
                new Employee(101, "Z3", 19, 9999.99),
                new Employee(105, "Jerry", 60, 4444.44),
                new Employee(102, "L4", 20, 7777.77),
                new Employee(103, "W5", 35, 6666.66),
                new Employee(104, "Tom", 44, 1111.11)

        );

        Collections.sort(emps, (a, b) -> {
            if (a.getAge().equals(b.getAge())) {
                return a.getName().compareTo(b.getName());
            } else {
                return Integer.compare(a.getAge(), b.getAge());

            }

        });
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }



}

