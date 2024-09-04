package com.yyds.unit11.demo;
public class Demo8Priority extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + "线程第" + i + "次执行！");
        }
    }
    public static void main(String[] args) {
        Demo8Priority t1 = new Demo8Priority();
        t1.setPriority(1);
        Demo8Priority t2 = new Demo8Priority();
        // 线程优先级范围是1-10
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
