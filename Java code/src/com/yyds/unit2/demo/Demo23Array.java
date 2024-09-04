package com.yyds.unit2.demo;
public class Demo23Array {
    public static void main(String[] args) {
        int[] arr = new int[3];
        // 根据索引给数组某个位置赋值，索引不能超过数组长度
        arr[0] = 10086;
        arr[1] = 10010;
        arr[2] = 10000;
        // 根据索引获取元素
        int num2 = arr[2];
        int num1 = arr[1];
        int num0 = arr[0];
        System.out.println("num0：" + num0);
        System.out.println("num1：" + num1);
        System.out.println("num2：" + num2);
    }
}
