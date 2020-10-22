package com.example.demo.lamada.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 13:10 2020/10/22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private Double salary;
}
