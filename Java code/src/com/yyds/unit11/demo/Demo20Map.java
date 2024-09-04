package com.yyds.unit11.demo;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
public class Demo20Map implements Runnable{
    private static Map<String, String> map = new HashMap<>();
    private static CountDownLatch latch = new CountDownLatch(4);
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                map.put(UUID.randomUUID().toString(), i+"");
            }
        }finally {
            latch.countDown();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Demo20Map runnable = new Demo20Map();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        latch.await();
        System.out.println("HashMap中元素个数："+map.size());
    }
}
