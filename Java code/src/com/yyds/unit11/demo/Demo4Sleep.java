package com.yyds.unit11.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo4Sleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
            System.out.println("当前时间：" + format);
            Thread.sleep(1000);
        }
    }
}
