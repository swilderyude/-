package com.yyds.unit2.demo;
public class Demo26Array {
    public static void main(String[] args) {
        int[] arr = new int[]{68,23,75,63,12,79,52,34,75,62,10};
        // 先假设第0个元素是最大值
        int max = arr[0];
        // 遍历数组
        for (int num : arr) {
            if(num > max) {
                // 如果遍历到的元素比假设的最大值还大，就假设这个元素是最大值
                max = num;
            }
        }
        // 当遍历完毕后，已经找不到比假设的最大值还大的元素了
        System.out.println("数组中最大值为：" + max);
    }
}
