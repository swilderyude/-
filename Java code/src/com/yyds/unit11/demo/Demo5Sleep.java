package com.yyds.unit11.demo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Demo5Sleep {
    public static void main(String[] args) throws InterruptedException {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        System.out.println("当前时间：" + format);
        // 休眠3秒24毫秒
        TimeUnit.SECONDS.sleep(3);
        TimeUnit.MILLISECONDS.sleep(24);
        String end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        System.out.println("当前时间：" + end);
    }
}
