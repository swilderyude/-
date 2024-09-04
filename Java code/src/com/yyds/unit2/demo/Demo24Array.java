package com.yyds.unit2.demo;
public class Demo24Array {
    public static void main(String[] args) {
        // 直接创建有元素的数组
        String[] arr = {"Java", "PHP", "Python", "C++", "Golang"};
        // 从0-length-1，每次遍历时i都是当前索引
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            System.out.println("索引为" + i + "处的元素为：" + str);
        }
    }
}
