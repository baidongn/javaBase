package com.example.algorithm2;

import java.util.Scanner;

/**
 * @Author： bd
 * @Description: 素数之积 质数：除了1和本身不能被其他数整除)
 * @Date: Created in 11:40 2022/7/4
 */

/**
 * RSA加密算法在网络安全世界中无处不在，它利用了极大整数因数分解的困难度，数据越大，安全系数越高，给定一个32位正整数，请对其进行因数分解，找出是哪两个素数的乘积。
 * 输入描述:
 * 一个正整数num
 * 0 < num <= 2147483647
 * 输出描述:
 * 如果成功找到，以单个空格分割，从小到大输出两个素数，分解失败，请输出-1 -1
 * 示例1
 * 输入
 * 15
 * 输出
 * 3 5
 * 说明
 * 因数分解后，找到两个素数3和5，使得3*5=15，按从小到大排列后，输出3 5
 * 示例2
 * 输入
 * 27
 * 输出
 * -1 -1
 * 说明
 * 通过因数分解，找不到任何素数，使得他们的乘积为27，输出-1 -1
 */
public class PrimeProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        primeProduct(i);

    }

    private static void primeProduct(int i) {
        //加币定理
        int max = i;
        //最小的质数是3
        for (int j = 3; j < max; j++) {
            if (i % j == 0) {
                max = i / j;
                if (check(j) && check(max)) {
                    System.out.println(j + " " + max);
                    //找到了 就直接返回
                    return;
                }
            }
        }
        System.out.println("-1" + " " + "-1");
    }

    private static boolean check(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
