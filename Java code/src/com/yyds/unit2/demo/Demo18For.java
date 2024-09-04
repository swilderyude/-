package com.yyds.unit2.demo;

public class Demo18For {
    public static void main(String[] args) {
        // 不确定循环次数，使用while
        int num = 0;
        while (true) {
            num++;
            // 如果是奇数就直接跳过
            if(num % 2 == 1) {
                continue;
            }
            if(num % 3 == 2 && num % 5 == 3 && num % 7 == 4) {
                // 找到了正确的人数，终止循环
                System.out.println("至少需要" + num + "人");
                break;
            }
        }
    }
}
