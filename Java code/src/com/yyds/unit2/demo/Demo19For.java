package com.yyds.unit2.demo;

public class Demo19For {
    public static void main(String[] args) {
        // 素数个数
        int count = 0;
        // 2是最小的素数，从2开始
        int num = 2;
        // 不确定找多少次，while循环
        while (true) {
            // 先假设是
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if(num % i == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(num + "\t");
                count++;
                if(count % 5 == 0) {
                    System.out.println();
                }
                if(count == 20) {
                    break;
                }
            }
            num++;
        }
    }
}
