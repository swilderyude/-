package com.yyds.unit11.demo;

import java.util.concurrent.TimeUnit;

public class Demo6Daemon {
    public static void main(String[] args) throws InterruptedException {
        Demo2Runnable runnable = new Demo2Runnable();
        Thread thread = new Thread(runnable);
        // 设置为守护线程
        thread.setDaemon(true);
        thread.start();
        for (int i = 0; i < 2; i++) {
            System.out.println("main主线程--" + i);
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
