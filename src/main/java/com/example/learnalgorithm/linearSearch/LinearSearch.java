package com.example.learnalgorithm.linearSearch;

import com.example.learnalgorithm.common.ArrayGenerator;

/**
 * @Author： bd
 * @Description: 线性查找
 * @Date: Created in 14:30 2021/12/30
 */
public class LinearSearch {

    private LinearSearch() {
    }  //构造方法私有，别的方法不能调用

    public static int search(int[] date, int target) {
        for (int i = 0; i < date.length; i++) {
            if (target == date[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        /**
         int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
         int i = LinearSearch.search(data, 10);
         System.out.println(i);

         Integer[] data1 = {1, 2, 3, 4, 5, 6, 7, 8};
         int i1 = LinearSearch.search(data1, 6);
         System.out.println(i1);

         Student[] students = new Student[]{new Student("xiaoming"),
         new Student("xiaoming1"),
         new Student("xiaoming2"),
         new Student("xiaoming3"),
         new Student("xiaoming4"),
         new Student("xiaoming5"),
         };
         int i2 = LinearSearch.search(students, new Student("xiaoming5"));
         System.out.println(i2);
         */
        int[] datasize = {1000000, 10000000};
        for (int n : datasize) {
//            int n = 1000000;
            Integer[] array = ArrayGenerator.generateOrderArray(n);
            long start = System.nanoTime();
            //只運行一次可能由於系統原因导致不稳定，因为1亿次可能导致没有足够的连续空间
            for (int i = 0; i < 100; i++) {
                int search = LinearSearch.search(array, n);

            }
            long end = System.nanoTime();

            double time = (end - start) / 1000000000.0;//希望结果是一个浮点数，所以有 .0
            System.out.println("n="+n+",100 runs"+time + "s");
        }





    }

    //#################################################################################################


    /**
     * 因为现在是int类型数组，但是对于 string，float等要使用这个方法就需要单独写方法，所以我们需要将它做成通用方法
     * 本题中  只需要定义泛型方法，不需要定义泛型类
     *
     */

    public static <E> int search(E[] data, E target) {
        for (int i = 0; i < data.length; i++) {
            if (target.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    //##################################################################################################


    /**
     * 设计一个student类，用上面写的方法进行查找（注意要重新equal和hashcode方法）
     */


}
