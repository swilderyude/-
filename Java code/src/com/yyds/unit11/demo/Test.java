package com.yyds.unit11.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: 杨德石
 * @Date: 2022/5/6 21:58
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        // 在try前一行获取锁，如果获取失败，则不会进入try内代码。如果获取成功，紧接着就是try...catch...finally，一定能够释放锁
        lock.lock();
        try {
            // 业务代码
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            // 借助finally的特点，只要成功获取锁，最后一定会执行finally中的代码。将unlock放在第一行，保证一定能够释放锁
            lock.unlock();
        }
    }
}
