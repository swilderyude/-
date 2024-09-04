package com.yyds.unit11.demo;

import java.util.concurrent.TimeUnit;

public class Demo1Thread extends Thread{
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
        Demo1Thread thread = new Demo1Thread();
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
