package com.yyds.unit2.demo;

import java.util.Arrays;

public class Demo35Exchange {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        System.out.println("交换前：num1=" + num1 + ",num2=" + num2);
        exchange(num1, num2);
        System.out.println("交换后：num1=" + num1 + ",num2=" + num2);
        int[] arr = {1, 2, 3, 4};
        System.out.println("交换前：" + Arrays.toString(arr));
        exchange(arr, 1, 2);
        System.out.println("交换后：" + Arrays.toString(arr));
    }

    public static void exchange(int num1, int num2) {
        int tmp = num1;
        num1 = num2;
        num2 = tmp;
    }

    public static void exchange(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
