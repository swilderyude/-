package com.yyds.unit2.demo;

public class Demo31BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9, 10, 12, 13, 15};
        int index = binarySearch(arr, 13);
        System.out.println("元素13所在的索引位置为："+index);
    }

    public static int binarySearch(int[] arr, int value) {
        // 最小索引
        int min = 0;
        // 最大索引
        int max = arr.length - 1;
        // 开始循环查找
        while (true) {
            // 获取中间索引
            int mid = (min + max) / 2;
            // 如果arr[mid]>value,则证明在上半区
            if (arr[mid] > value) {
                // 更新max的值
                max = mid - 1;
            }
            // 如果arr[mid]<value,则证明在下半区
            else if (arr[mid] < value) {
                // 更新min的值
                min = mid + 1;
            }
            // 如果arr[mid]==value,则证明找到
            else {
                return mid;
            }
            // 如果min>max,则证明没找到该值
            if (min > max) {
                return -1;
            }
        }
    }
}
