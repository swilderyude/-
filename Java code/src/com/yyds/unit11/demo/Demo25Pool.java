package com.yyds.unit11.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo25Pool {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2, 4, // 核心线程数与最大线程数
                60, TimeUnit.SECONDS, // 线程存活时间为6 秒
                new ArrayBlockingQueue<>(2), // 任务队列使用容量为2的ArrayBlockingQueue
                Executors.defaultThreadFactory(), // 线程工厂，使用默认的即可
                new ThreadPoolExecutor.AbortPolicy()); // 饱和策略，超出线程池可容纳的容量后，丢弃多的任务并抛出异常
        // lambda创建runnable
        Runnable runnable = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "执行了");
        };
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
        executor.execute(runnable);
    }
}
