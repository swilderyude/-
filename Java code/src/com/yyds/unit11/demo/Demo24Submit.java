package com.yyds.unit11.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Demo24Submit implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int time = (int)(Math.random() * 3000 + 2000);
        TimeUnit.MILLISECONDS.sleep(time);
        return time;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Demo24Submit callable = new Demo24Submit();
        Future<Integer> future1 = executorService.submit(callable);
        Future<Integer> future2 = executorService.submit(callable);
        Future<Integer> future3 = executorService.submit(callable);
        System.out.println(future1.get());
        System.out.println(future2.get());
        System.out.println(future3.get());
    }
}
