package com.yyds.unit11.demo;

import java.util.concurrent.TimeUnit;

public class Demo9Join implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"："+i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new Demo9Join());
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("主线程：" + i);
            if(i == 2) {
                // i=2后，主线程等待thread执行完毕后再继续执行
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
