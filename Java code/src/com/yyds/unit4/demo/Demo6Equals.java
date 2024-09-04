package com.yyds.unit4.demo;
public class Demo6Equals {
    public static void main(String[] args) {
        People p1 = new People();
        p1.setName("张三");
        p1.setAge(23);
        People p2 = new People();
        p2.setName("张三");
        p2.setAge(23);
        People p3 = new People();
        p3.setName("李四");
        p3.setAge(24);
        // == 比较的是地址，p1和p2是两个对象，地址不同
        System.out.println("p1 == p2：" + (p1 == p2));
        System.out.println("p1 equals p2：" + p1.equals(p2));
        System.out.println("p1 equals p3：" + p1.equals(p3));
    }
}
