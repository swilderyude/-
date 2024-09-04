package com.yyds.unit2.demo;

public class Demo8Operator {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 3;
        int num3 = 5;
        System.out.println("num1 > num2 & num1 > num3：" + (num1 > num2 & num1 > num3));
        System.out.println("num1 > num2 | num2 > num3：" + (num1 > num2 | num2 > num3));
        System.out.println("num1 > num2 && num1 > num3：" + (num1 > num2 && num1 > num3));
        System.out.println("num1 > num2 || num2 > num3：" + (num1 > num2 || num2 > num3));
        System.out.println("num1 > num2：" + (num1 > num2) + "，!(num1 > num2)：" + !(num1 > num2));
        System.out.println("num1 > num2 ^ num1 > num3：" + (num1 > num2 ^ num1 > num3));
    }
}
