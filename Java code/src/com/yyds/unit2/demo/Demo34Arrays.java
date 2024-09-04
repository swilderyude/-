package com.yyds.unit2.demo;

import java.util.Arrays;

public class Demo34Arrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 5, 12, 13, 7, 4, 2, 15, 9};
        int[] arr2 = {2, 4, 5, 7, 9, 10, 12, 13, 15};
        // 直接使用Arrays.方法名调用
        System.out.println("排序前arr1：" + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("排序后arr1：" + Arrays.toString(arr1));
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println("arr1与arr2比较：" + equals);
        int index = Arrays.binarySearch(arr1, 7);
        System.out.println("元素7在arr1中的位置为：" + index);
    }
}
