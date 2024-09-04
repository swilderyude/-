package com.yyds.unit11.demo;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo16Ticket implements Runnable {
    private static int ticket = 100;
    // 创建lock对象
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket <= 0) {
                    break;
                }
                TimeUnit.MILLISECONDS.sleep(100);
                ticket--;
                String name = Thread.currentThread().getName();
                System.out.println(name + "出票成功，剩余" + ticket + "张票");
            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        }
    }
    public static void main(String[] args) {
        Demo16Ticket runnable = new Demo16Ticket();
        // 设置线程名称
        new Thread(runnable, "窗口1").start();
        new Thread(runnable, "窗口2").start();
        new Thread(runnable, "窗口3").start();
    }
}
