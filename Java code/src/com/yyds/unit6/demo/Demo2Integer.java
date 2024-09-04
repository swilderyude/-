package com.yyds.unit6.demo;
public class Demo2Integer {
    public static void main(String[] args) {
        // JDK5之前，这种写法是不允许的，但有了自动装箱机制后，就可以这么写
        Integer num1 = 10;
        // JDK5之前，这种写法也是不允许的
        int num2 = num1;
        // 包装类+基本数据类型，这个过程实际上会将包装类进行自动拆箱
        int num3 = num1 + num2;
        System.out.println("num1：" + num1);
        System.out.println("num2：" + num2);
        System.out.println("num3：" + num3);
    }
}
