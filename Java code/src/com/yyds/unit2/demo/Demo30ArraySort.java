package com.yyds.unit2.demo;

public class Demo30ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 12, 13, 7, 4, 2, 15, 9};
        selectSort(arr);
        System.out.println("排序后数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selectSort(int[] arr) {
        //每次从剩下的元素中选择最小值放到第一个位置
        for (int i = 0; i < arr.length - 1; i++) {
            //记录每一趟最小值坐标
            int min = i;
            //寻找每一趟的最小值 先找到坐标 最后再进行交换 减少交换次数
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //元素交换
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
