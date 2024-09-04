package com.yyds.unit2.demo;

public class Demo29ArraySort {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 5, 12, 13, 7, 4, 2, 15, 9};
        bubbleSort(arr);
        System.out.println("排序后数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        //外层循环控制趟数
        for (int i = arr.length - 1; i > 0; i--) {
            //节点比较 只比较到第i个元素即可
            for (int j = 0; j < i; j++) {
                //交换元素
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
