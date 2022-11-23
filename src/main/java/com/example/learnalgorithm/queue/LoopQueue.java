package com.example.learnalgorithm.queue;

/**
 * @Author： bd
 * @Description: 循环队列
 * @Date: Created in 10:05 2022/1/25
 */
public class LoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front, tail;
    private int size;

    public LoopQueue(int capacity) {
        //传入的是用户希望創建的大小，但是循环数组会浪费一个空间，所以+1
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue() {
        this(10);
    }

    //循环队列中最多可以装多少个元素
    public int  getCapacity() {
        return data.length - 1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front==tail;
    }

    @Override
    public void enqueue(E e) {

        if ((tail + 1) % data.length == front) {
            resize(getCapacity()*2);
        }

    }

    //扩容
    private void resize(int  newCapaCity) {

        E[] newData = (E[])new Object[newCapaCity + 1];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

    }


    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }
}
