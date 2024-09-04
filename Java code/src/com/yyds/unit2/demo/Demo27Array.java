package com.yyds.unit2.demo;
public class Demo27Array {
    public static void main(String[] args) {
        int[] arr = new int[]{68,23,75,63,12,79,52,34,75,62,10};
        // 待查找的值
        int num = 34;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]) {
                index = i;
                // 只要找到了，后面的就没必要再找了
                break;
            }
        }
        if(index == -1) {
            System.out.println("待查找的值" + num + "不存在于数组中");
        }else {
            System.out.println("待查找的值" + num + "在数组中首次出现的索引为：" + index);
        }
    }
}
