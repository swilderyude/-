package com.yyds.unit11.demo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: 杨德石
 * @Date: 2022/5/8 22:47
 * @Version 1.0
 */
public class Demo19CountDownLatch implements Runnable {
    private final CountDownLatch latch;
    private final AtomicInteger count;

    public Demo19CountDownLatch(CountDownLatch latch, AtomicInteger count) {
        this.latch = latch;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            String name = Thread.currentThread().getName();
            System.out.println(name + "开始起跑");
            // 随机休眠，模拟跑步时间长短区别
            int time = (int) (Math.random() * 2000);
            TimeUnit.MILLISECONDS.sleep(time);
            // 原子类记录名次
            int num = count.incrementAndGet();
            System.out.println(name + "到达终点，是第" + num + "名");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            // finally第一行执行，保证计数器一定能-1
            latch.countDown();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("比赛开始！");
        CountDownLatch latch = new CountDownLatch(6);
        AtomicInteger count = new AtomicInteger(0);
        Demo19CountDownLatch runnable = new Demo19CountDownLatch(latch, count);
        new Thread(runnable, "马塞洛·雅各布斯").start();
        new Thread(runnable, "弗雷德·克利").start();
        new Thread(runnable, "安德烈德·德格拉斯").start();
        new Thread(runnable, "阿卡尼·辛比内").start();
        new Thread(runnable, "罗尼·贝克").start();
        new Thread(runnable, "苏炳添").start();
        // 计数器在这里陷入阻塞，直到计数器归0才会继续向下执行
        latch.await();
        System.out.println("比赛结束！");
    }

}
