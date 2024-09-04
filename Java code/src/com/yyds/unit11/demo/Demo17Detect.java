package com.yyds.unit11.demo;

import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo17Detect {

    private static final Lock lock = new ReentrantLock();
    // 生产者的condition
    private static final Condition conditionProduct = lock.newCondition();
    // 消费者的condition
    private static final Condition conditionConsume = lock.newCondition();

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        new Thread(new Demo17Inspector(stack)).start();
        new Thread(new Demo17Inspector(stack)).start();
        new Thread(new Demo17Inspector(stack)).start();
        new Thread(new Demo17Temperature(stack)).start();
    }

    static class Demo17Temperature implements Runnable {
        private Stack<String> stack;

        public Demo17Temperature(Stack<String> stack) {
            this.stack = stack;
        }

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            while (true) {
                lock.lock();
                try {
                    while (stack.size() == 5) {
                        // 生产者开始等待
                        System.out.println("排队区已满，体温测量员 " + name + " 开始等待");
                        conditionProduct.await();
                    }
                    String s = UUID.randomUUID().toString();
                    stack.push(s);
                    System.out.println(s + "体温测量完毕");
                    System.out.println("排队区当前人数：" + stack.size());
                    // 唤醒消费者
                    conditionConsume.signal();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        }
    }

    static class Demo17Inspector implements Runnable {
        private Stack<String> stack;

        public Demo17Inspector(Stack<String> stack) {
            this.stack = stack;
        }

        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            while (true) {
                lock.lock();
                try {
                    while (stack.size() == 0) {
                        System.out.println("排队区已无人员等待，核酸检测员 " + name + " 开始等待");
                        // 消费者等待
                        conditionConsume.await();
                    }
                    String s = stack.pop();
                    System.out.println(s + "核酸检测完毕");
                    System.out.println("排队区剩余人数：" + stack.size());
                    // 唤醒生产者
                    conditionProduct.signal();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        }
    }
}
