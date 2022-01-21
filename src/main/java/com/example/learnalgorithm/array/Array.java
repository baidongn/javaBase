package com.example.learnalgorithm.array;

import com.sun.org.apache.regexp.internal.RE;
import org.yaml.snakeyaml.events.Event;
import sun.plugin2.message.GetAppletMessage;

import java.io.File;
import java.util.Arrays;

/**
 * @Author： bd
 * @Description: 数组
 * @Date: Created in 16:17 2022/1/5
 */
public class Array<E> {
    //数组名称
    private E[] data;
    //数组实际容量（指向下一个要添加的元素）
    private int size;

    //构造函数
    public Array(int capcacity) {
        //java 不能直接new 泛型，只能通过new Object[]；再强转为 (E[])new Object[capcacity]
        data = (E[]) new Object[capcacity];
        size = 0;
    }

    public Array() {
        this(10);
    }

    //获取数组中元素个数
    public int getSize() {
        return size;
    }

    //获取数组最大容量
    public int getCapcacity() {
        return data.length;
    }

    //是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //向所有元素后添加新的元素（更新指针指向下一个元素）
    public void addLast(E e) {
        /**
         if (size == data.length) {
         throw new IllegalArgumentException("AddLast  failed，Array is  full");
         }
         //        data[size] = e;
         //        size++;
         data[size++] = e;
         */
        add(size, e);

    }

    //向头部添加元素
    public void addFirst(E e) {
        add(0, e);
    }

    //向指定位置添加元素
    // （将元素向后移动，从最后一个进行移动，最后一个size要++（因为后移的时候，size 位置被占用了））
    public void add(int index, E e) {


        if (index < 0 || index > size) {
            throw new IllegalArgumentException("AddLast  failed，Require index >=0 or index <= size");
        }

        if (size == data.length) {
//            throw new IllegalArgumentException("AddLast  failed，Array is  full");
            //动态扩容
            resize(2 * data.length);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }


    //查询index位置中元素
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("AddLast  failed，Index is  illegal");
        }
        return data[index];
    }

    //修改inde位置的值
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("AddLast  failed，Index is  illegal");
        }
        data[index] = e;
    }

    //查找数组汇中是否有元素e
    public boolean contains(E e) {

        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //查找数组中元素e的索引,不存在元素e，则返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //删除元素  size--,返回删除的元素
    public E remove(int index) {
        //有元素的区间是[0,size-1] ,不能超出这个范围
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("AddLast  failed，Index is  illegal");
        }

        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        //不再引用，直接回收（不写也可以）
        data[size] = null;

        //避免复杂度震荡
        if (size == data.length / 4 && data.length /2 !=0){
            resize(data.length / 2);
        }

        return ret;
    }

    //刪除第一個元素
    public E removeFirst() {
        return remove(0);
    }


    //刪除最後一個元素
    public E removeLast() {
        return remove(size - 1);
    }


    //删除存在的元素(只会删除一个)
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }

    private void resize(int newCatacity) {
        E[] newData = (E[]) new Object[newCatacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }


    @Override
    public String toString() {
        return "Array{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size + "，catacity=" + data.length +
                '}';
    }
}
