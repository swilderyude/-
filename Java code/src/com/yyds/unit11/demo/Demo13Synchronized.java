package com.yyds.unit11.demo;

import java.util.concurrent.TimeUnit;

public class Demo13Synchronized implements Runnable {
    private Account account;
    private int type;

    public Demo13Synchronized(Account account, int type) {
        this.account = account;
        this.type = type;
    }

    @Override
    public void run() {
        if (type == 1) {
            account.drawBalance(3000);
        }else {
            account.drawBalance2(3000);
        }
    }

    private static class Account {
        private Integer balance = 5000;

        public void drawBalance(Integer amount) {
            String name = Thread.currentThread().getName();
            // 使用当前对象作为同步监视器
            synchronized (this) {
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

        public synchronized void drawBalance2(Integer amount) {
            String name = Thread.currentThread().getName();
            // 判断余额是否足够
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
            System.out.println("余额不足，" + name + "取钱失败");
        }

        public Integer getBalance() {
            return this.balance;
        }
    }

    public static void main(String[] args) {
        // 银行卡只有一张，所以new一个对象
        Account account = new Account();
        new Thread(new Demo13Synchronized(account, 1)).start();
        new Thread(new Demo13Synchronized(account, 2)).start();
    }
}
