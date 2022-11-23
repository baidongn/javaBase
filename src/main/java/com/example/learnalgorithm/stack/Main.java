package com.example.learnalgorithm.stack;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:50 2022/1/6
 */
public class Main {

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }
        stack.pop();
        System.out.println(stack);
    }
}
