package com.yyds.unit2.demo;
public class Demo32Method {
    public static void main(String[] args) {
        System.out.println(add(1,2,3,4));
        System.out.println(add(1,2,3,4,5,6));
        System.out.println(add(1,2,3));
    }
    public static int add(int ...nums) {
        // 可变参数在处理时相当于数组
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
