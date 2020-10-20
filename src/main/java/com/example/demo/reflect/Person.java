package com.example.demo.reflect;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:21 2020/10/20
 */
public class Person {

    private String name;

    private Integer year;

    public Person() {
    }

    public Person(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public void paramMethod(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
