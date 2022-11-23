package com.example.learnalgorithm.stack;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:19 2022/1/21
 */
public interface Stack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
