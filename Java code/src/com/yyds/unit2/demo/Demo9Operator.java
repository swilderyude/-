package com.yyds.unit2.demo;

public class Demo9Operator {
    public static void main(String[] args) {
        int num1 = 13;
        int num2 = 6;
        System.out.println("num2 << 2：" + (num2 << 2));
        System.out.println("num1 >> 2：" + (num1 >> 2));
        System.out.println("num2 >>> 1：" + (num2 >>> 1));
        System.out.println("num1 & num2：" + (num1 & num2));
        System.out.println("num1 | num2：" + (num1 | num2));
        System.out.println("num1 ^ num2：" + (num1 ^ num2));
        System.out.println("~num1：" + (~num1));
    }
}
