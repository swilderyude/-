package com.yyds.unit6.demo;

public class Demo8StringOther {
    public static void main(String[] args) {
        String str1 = "HelloJava";
        String str2 = "helloJava";
        System.out.println("str1是否为空：" + str1.isEmpty());
        System.out.println("str1与str2是否相等：" + str1.equals(str2));
        System.out.println("str1与str2忽略大小写比较：" + str1.equalsIgnoreCase(str2));
        System.out.println("str1与str2先后顺序：" + str1.compareTo(str2));
    }
}
