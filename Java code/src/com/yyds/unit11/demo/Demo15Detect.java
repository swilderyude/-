package com.yyds.unit11.demo;

import java.util.Stack;
import java.util.UUID;

public class Demo15Detect {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Object lock = new Object();
        new Thread(new Demo15Inspector(stack, lock)).start();
        new Thread(new Demo15Inspector(stack, lock)).start();
        new Thread(new Demo15Inspector(stack, lock)).start();
        new Thread(new Demo15Temperature(stack, lock)).start();
    }

    // 体温测量员
    static class Demo15Temperature implements Runnable {
        // 使用栈模拟排队区。栈方便取数据，并且Java中的栈是线程安全的
        private Stack<String> stack = new Stack<>();
        private final Object lock;

        public Demo15Temperature(Stack<String> stack, Object lock) {
            this.stack = stack;
            this.lock = lock;
        }

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            // 不停的进行生产
            while (true) {
                try {
                    synchronized (lock) {
                        // 如果排队区已经满了，则不再测量体温
                        if (stack.size() == 1) {
                            // 体温测量员开始等待
                            System.out.println("排队区已满，体温测量员 " + name + " 开始等待");
                            lock.wait();
                        }
                        // 如果没等待，就测量体温
                        String s = UUID.randomUUID().toString();
                        stack.push(s);
                        System.out.println(s + "体温测量完毕");
                        System.out.println("排队区当前人数：" + stack.size());
                        // 只要测量了体温，排队区一定有人，通知核酸检测员
                        lock.notify();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }


    // 核酸检测员
    static class Demo15Inspector implements Runnable {
        private Stack<String> stack = new Stack<>();
        private final Object lock;

        public Demo15Inspector(Stack<String> stack, Object lock) {
            this.stack = stack;
            this.lock = lock;
        }

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            while (true) {
                try {
                    synchronized (lock) {
                        // 如果排队区已经空了，则不再检测核酸
                        if (stack.size() == 0) {
                            System.out.println("排队区已无人员等待，核酸检测员 " + name + " 开始等待");
                            lock.wait();
                        }
                        // 如果没等待，就测核酸
                        String s = stack.pop();
                        System.out.println(s + "核酸检测完毕");
                        System.out.println("排队区剩余人数：" + stack.size());
                        // 只要有人进行了核酸检测，排队区一定会有一个空位
                        lock.notify();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
