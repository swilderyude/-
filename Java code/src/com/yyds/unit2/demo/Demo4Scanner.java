package com.yyds.unit2.demo;

import java.util.Scanner;

public class Demo4Scanner {
    public static void main(String[] args) {
        // 虽然是引用类型，但变量的创建方式还是差不多的，sc是变量名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        // String类型也是引用类型，代表着字符串
        String str = sc.next();
        System.out.println("你输入的字符串为：" + str);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        System.out.println("你输入的整数为：" + num);
    }
}
