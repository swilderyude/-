package com.yyds.unit2.demo;

public class Demo15While {
    public static void main(String[] args) {
        int count = 0;
        // 从11开始找，11之前的肯定不符合要求
        int num = 11;
        // 只要小于10个就继续找
        while (count < 10) {
            if(num % 7 == 0 && num % 11 == 0) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
