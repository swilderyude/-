package com.yyds.unit6.demo;
public class Demo6StringFind {
    public static void main(String[] args) {
        String s = "你好，Java";
        System.out.println("字符串长度为：" + s.length());
        System.out.println("字符串索引3处的字符为：" + s.charAt(3));
        System.out.println("字符串中a第一次出现的索引为：" + s.indexOf('a'));
        System.out.println("字符串是否以'你'开头：" + s.startsWith("你"));
        System.out.println("字符串是否以'！'结尾：" + s.endsWith("！"));
        System.out.println("字符串中是否包含'Java'：" + s.contains("Java"));
    }
}
