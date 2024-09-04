package com.yyds.unit11.demo;
import java.util.concurrent.*;
public class Demo3Callable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "--" + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "SUCCESS";
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Demo3Callable callable = new Demo3Callable();
        FutureTask<String> future = new FutureTask<>(callable);
        Thread thread = new Thread(future);
        thread.start();
        // 获取返回值
        String s = future.get();
        System.out.println(s);
    }
}
