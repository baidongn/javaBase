package com.example;

import java.util.BitSet;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author： bd
 * @Description:   https://www.jianshu.com/p/3112bb0364a0
 * @Date: Created in 17:33 2021/7/20
 */
public class AQS {

    public static void main(String[] args) {
        lockSupport2();
    }

    private static void lockSupport1() {
        System.out.println("Hello，LockSupport");
        LockSupport.park();
        System.out.println("Bye，LockSupport");

    }

    private static void lockSupport2() {
        System.out.println("Hello，LockSupport");
        LockSupport.unpark(Thread.currentThread());
        LockSupport.park();
        System.out.println("Bye，LockSupport");
        new BitSet();
    }

}
