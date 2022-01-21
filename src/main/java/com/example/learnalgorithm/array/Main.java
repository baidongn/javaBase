package com.example.learnalgorithm.array;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 10:50 2022/1/6
 */
public class Main {

    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        for (int i = 0; i <10; i++) {
            array.addLast(i);
        }
        System.out.println(array);
        array.add(1, 100);
        System.out.println(array);

        array.addFirst(-1);
        System.out.println(array);

        //[-1, 0, 100, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 0]
        array.remove(2);
        System.out.println(array);

        array.removeElement(4);
        System.out.println(array);

        array.removeFirst();
        System.out.println(array);
    }
}
