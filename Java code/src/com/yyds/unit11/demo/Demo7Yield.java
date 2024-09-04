package com.yyds.unit11.demo;
public class Demo7Yield extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + "线程第" + i + "次执行！");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        new Demo7Yield().start();
        new Demo7Yield().start();
    }
}
