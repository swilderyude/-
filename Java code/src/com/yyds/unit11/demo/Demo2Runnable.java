package com.yyds.unit11.demo;

import java.util.concurrent.TimeUnit;

public class Demo2Runnable implements Runnable{
    @Override
    public void run() {
        // 获取线程名称
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "--" + i);
            // 等待1秒
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Demo2Runnable runnable = new Demo2Runnable();
        // 这里需要new Thread
        Thread thread = new Thread(runnable);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main主线程--" + i);
            // 等待1秒
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
