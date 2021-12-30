package com.example.demo.thread;

import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.concurrent.Executors.*;

/**
 * @Author： bd
 * @Description:
 * @Date: Created in 14:02 2021/6/17
 */
public class ThreadTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.run();
//
//
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);
        thread.start();
//
//        executors();
//
//        executors1();

    }


    //继承Tread类
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("MyThread.run()");

        }
    }

    //实现Runable接口
    public static class MyThread2 implements Runnable {
        @Override
        public void run() {
            System.out.println("MyThread2.run()");
        }
    }

    //实现Callable接口
    public static class MyCallable implements Callable {
        @Override
        public Object call() throws Exception {
            return System.currentTimeMillis();
        }

    }


    //线程池有返回值任务 callable
    private static void executors() throws ExecutionException, InterruptedException {
        //创建线程池
        ExecutorService pool = newFixedThreadPool(10);

        ArrayList<Future> futures = new ArrayList<>();

        //创建多个有返回值得任务
        for (int i = 0; i < 10; i++) {
            MyCallable myCallable = new MyCallable();
            Future submit = pool.submit(myCallable);
            futures.add(submit);
        }
        //关闭线程池
        pool.shutdown();

        //获取所有结果
        for (Future future :
                futures) {
            System.out.println(future.get());

        }

    }

    //
    private static void executors1() {
        //创建线程池
        ExecutorService pool = newFixedThreadPool(10);

        while (true) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " is running ..");
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });


        }


    }



}
