package com.example.learnalgorithm.queue;

import com.example.learnalgorithm.stack.ArrayStack;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:50 2022/1/6
 */
public class Main {

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
            System.out.println(queue);
        }
        queue.dequeue();
        System.out.println(queue);
    }
}
