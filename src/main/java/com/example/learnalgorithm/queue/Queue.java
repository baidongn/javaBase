package com.example.learnalgorithm.queue;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 15:19 2022/1/21
 */
public interface Queue<E> {

    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();

}
