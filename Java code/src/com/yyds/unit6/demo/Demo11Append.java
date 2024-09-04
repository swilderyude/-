package com.yyds.unit6.demo;
public class Demo11Append {
    public static void main(String[] args) {
        String str1 = "";
        StringBuffer str2 = new StringBuffer();
        StringBuilder str3 = new StringBuilder();
        // 获取当前时间的毫秒值
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str1 += i;
        }
        long time2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str2.append(i);
        }
        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str3.append(i);
        }
        long time4 = System.currentTimeMillis();
        System.out.println("String耗时：" + (time2 - time1));
        System.out.println("StringBuffer耗时：" + (time3 - time2));
        System.out.println("StringBuilder耗时：" + (time4 - time3));
    }
}
