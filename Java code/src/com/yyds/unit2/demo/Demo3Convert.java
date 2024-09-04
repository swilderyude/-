package com.yyds.unit2.demo;
public class Demo3Convert {
    public static void main(String[] args) {
        int num1 = 10;
        // int类型可以直接赋值给double，因为double的容量比int大
        double num2 = num1;
        // 使用+号拼接输出结果，其中文本要用双引号包裹起来
        System.out.println("num1：" + num1);
        System.out.println("num2：" + num2);
        // 将容量大的转换给容量小的，使用强制类型转换
        float num3 = (float) num2;
        System.out.println("num3：" + num3);
        // 算术运算过程中也发生了隐式转换
        // 首先num1与num3数据类型不一致，会将num1隐式转换成float，保证两个float类型能够运算
        // 接着计算出的结果也是float，会将它隐式转换成double
        double num4 = num1 + num3;
        System.out.println("num4：" + num4);
    }
}
