package com.yyds.unit2.demo;

public class Demo14For {
    public static void main(String[] args) {
        // 从1循环到1000
        // 计数器
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            // 判断是否满足要求
            if(i % 5 == 0 && i % 3 == 0) {
                System.out.print(i + "\t");
                count++;
                // 每5个一行
                if(count == 5) {
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
