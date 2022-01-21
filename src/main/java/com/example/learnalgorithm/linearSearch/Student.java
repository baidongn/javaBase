package com.example.learnalgorithm.linearSearch;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 15:21 2021/12/30
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object student) {
        //当前类 就是 传入的类
        if (this == student) {
            return true;
        }

        if (student == null) {
            return false;
        }

        if (! (student instanceof Student)) {
            return false;
        }

        Student stu = (Student) student;
        return this.name.equals(stu.name);
    }
}
