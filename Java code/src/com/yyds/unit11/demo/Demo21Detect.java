package com.yyds.unit11.demo;

import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Demo21Detect {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        new Thread(new Demo21Inspector(queue)).start();
        new Thread(new Demo21Temperature(queue)).start();
        new Thread(new Demo21Temperature(queue)).start();
    }

    static class Demo21Temperature implements Runnable {
        private BlockingQueue<String> queue;

        public Demo21Temperature(BlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            while (true) {
                String s = UUID.randomUUID().toString();
                try {
                    TimeUnit.SECONDS.sleep(1);
                    queue.put(s);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(s + "体温测量完毕");
                System.out.println("排队区当前人数：" + queue.size());
            }
        }
    }

    static class Demo21Inspector implements Runnable {
        private BlockingQueue<String> queue;

        public Demo21Inspector(BlockingQueue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            while (true) {
                String s = null;
                try {
                    TimeUnit.SECONDS.sleep(1);
                    s = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(s + "核酸检测完毕");
                System.out.println("排队区剩余人数：" + queue.size());

            }
        }
    }
}
