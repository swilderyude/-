package com.yyds.unit5.demo;

import java.util.Scanner;

public class Demo4Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {"北京", "上海", "武汉", "广州", "深圳"};
        System.out.println("请输入要获取的城市索引");
        int index = scanner.nextInt();
        String value = getValue(arr, index);
        System.out.println("您获取的城市为：" + value);
    }
    private static String getValue(String[] arr, int index) {
        // 对参数进行校验
        if(arr == null) {
            // 抛出非法参数异常，并指定提示文本
            throw new IllegalArgumentException("数组不能为空！");
        }
        if(index < 0) {
            throw new IllegalArgumentException("索引不能为负数！");
        }
        if(index >= arr.length) {
            // 抛出数组索引越界异常
            throw new ArrayIndexOutOfBoundsException("索引不可以超过数组长度！");
        }
        return arr[index];
    }
}
