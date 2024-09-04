package com.yyds.unit6.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo14SimpleDateFormat {
    public static void main(String[] args) throws Exception {
        // 将date转换成指定格式
        Date date1 = new Date();
        // 指定想要格式化的格式：4位年-2位月-2位日 2位时:2位分:2位秒.3位毫秒
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String s = format1.format(date1);
        System.out.println("date1格式化后：" + s);
        // 将格式化后的时间按照指定格式解析成Date
        String time = "2020/05/01-12:03:04";
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd-HH:mm:ss");
        Date date2 = format2.parse(time);
        System.out.println("time转换成date后：" + date2);
    }
}
