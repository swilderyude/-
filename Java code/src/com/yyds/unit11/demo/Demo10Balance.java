package com.yyds.unit11.demo;

import java.util.concurrent.TimeUnit;

public class Demo10Balance implements Runnable {
    private Account account;

    public Demo10Balance(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        account.drawBalance(3000);
    }

    private static class Account {
        private Integer balance = 5000;
        // 使用final修饰，保证锁对象引用不会被改变
        private final Object lock = new Object();

        public void drawBalance(Integer amount) {
            String name = Thread.currentThread().getName();
            // 判断余额是否足够
            synchronized (lock) {
                if (this.balance >= 3000) {
                    // 模拟网络波动
                    try {
                        TimeUnit.MILLISECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // 取钱
                    this.balance -= amount;
                    System.out.println(name + "取钱成功，余额为：" + this.balance);
                    // 这样可以省略下面的else
                    return;
                }
            }
            System.out.println("余额不足，" + name + "取钱失败");
        }

        public Integer getBalance() {
            return this.balance;
        }
    }

    public static void main(String[] args) {
        // 银行卡只有一张，所以new一个对象
        Account account = new Account();
        Demo10Balance runnable = new Demo10Balance(account);
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
}
