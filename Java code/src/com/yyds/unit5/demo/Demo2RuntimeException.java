package com.yyds.unit5.demo;

import java.util.Scanner;

public class Demo2RuntimeException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"北京", "上海", "武汉", "广州", "深圳"};
        System.out.println("请输入要获取的城市索引");
        int index = scanner.nextInt();
        System.out.println("您获取的城市为：" + arr[index]);
    }
}
