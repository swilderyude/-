package com.yyds.unit2.demo;

public class Demo21Overload {
    public static void main(String[] args) {
        System.out.println("add(int, int)：" + add(3,4));
        System.out.println("add(int, int, int)：" + add(3,4, 5));
        System.out.println("add(double, double)：" + add(3.2,4.1));
        System.out.println("add(double, double, double)：" + add(3.2,4.1, 5.3));
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    // 方法名相同，但参数个数不同，是重载
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    // 方法名相同，但参数类型不同，是重载
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

}
