package com.yyds.unit6.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo15Calendar {
    public static void main(String[] args) throws Exception {
        Calendar calendar = Calendar.getInstance();
        // 获取date
        Date date = calendar.getTime();
        int year = calendar.get(Calendar.YEAR);
        // 增加100天
        calendar.add(Calendar.DAY_OF_MONTH, 100);
        Date date2 = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间：" + format.format(date));
        System.out.println("100天后为：" + format.format(date2));
    }
}
