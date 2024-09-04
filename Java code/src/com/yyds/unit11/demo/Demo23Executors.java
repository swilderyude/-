package com.yyds.unit11.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Demo23Executors implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "执行了");
    }

    public static void main(String[] args) {
        Demo23Executors runnable = new Demo23Executors();
        // 解开这个注释，程序每秒钟执行一条任务，并且线程名称全部相同
//        ExecutorService executor = Executors.newSingleThreadExecutor();
        // 解开这个注释，程序会在1秒后执行所有任务，并且线程名称都不相同
//        ExecutorService executor = Executors.newCachedThreadPool();
        // 解开这个注释，程序会每秒钟执行两个任务，并且线程名只有两个
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
    }
}
