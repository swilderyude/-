package com.yyds.unit2.demo;
public class Demo28Array {
    public static void main(String[] args) {
        int[] arr = new int[]{68,23,75,63,12,79,52,34,75,62,10};
        // 创建一个长度一样的数组
        int[] arr2 = new int[arr.length];
        // 遍历旧数组，将旧数组中每一个元素放入到新数组对应的位置
        for (int i = 0; i < arr.length; i++) {
            // 计算对应的位置
            int index = arr.length - 1 - i;
            arr2[index] = arr[i];
        }
        System.out.print("反转前数组：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("反转后数组：");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
