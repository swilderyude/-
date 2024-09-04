package com.yyds.unit11.demo;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo18AtomicInteger implements Runnable {
    // 创建原子性Integer对象，初始值100
    private static AtomicInteger ticket = new AtomicInteger(20);

    @Override
    public void run() {
        while (true) {
            // 先-1再获取值
            int value = ticket.decrementAndGet();
            // 如果-1后为0，说明依然有票，因此=0的情况要排除
            if (value < 0) {
                break;
            }
            String name = Thread.currentThread().getName();
            System.out.println(name + "出票成功，剩余" + value + "张票");
        }
    }

    public static void main(String[] args) {
        Demo18AtomicInteger runnable = new Demo18AtomicInteger();
        // 设置线程名称
        Thread t1 = new Thread(runnable, "窗口1");
        Thread t2 = new Thread(runnable, "窗口2");
        Thread t3 = new Thread(runnable, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
