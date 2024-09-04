package com.yyds.unit11.demo;

import java.util.concurrent.TimeUnit;

public class Demo14DeadLock {
    private static final Object lockA = new Object();
    private static final Object lockB = new Object();

    public static void main(String[] args) {
        new Thread(new Demo14Runnable1()).start();
        new Thread(new Demo14Runnable2()).start();
    }

    static class Demo14Runnable1 implements Runnable {
        @Override
        public void run() {
            System.out.println("线程1开始运行，尝试获取A锁");
            // 先获取A锁
            synchronized (lockA) {
                System.out.println("线程1成功获取到A锁");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1尝试获取B锁");
                synchronized (lockB) {
                    System.out.println("线程1成功获取到B锁");
                }
            }
        }
    }
    static class Demo14Runnable2 implements Runnable {
        @Override
        public void run() {
            System.out.println("线程2开始运行，尝试获取B锁");
            // 先获取B锁
            synchronized (lockB) {
                System.out.println("线程2成功获取到B锁");
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程2尝试获取A锁");
                synchronized (lockA) {
                    System.out.println("线程2成功获取到A锁");
                }
            }
        }
    }

}
