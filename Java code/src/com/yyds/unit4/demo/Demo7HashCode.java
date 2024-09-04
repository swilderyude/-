package com.yyds.unit4.demo;

public class Demo7HashCode {
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
        // 由于参与计算的属性相同，因此hash码值相同
        System.out.println("p1：" + p1.hashCode());
        System.out.println("p2：" + p2.hashCode());
        System.out.println("p3：" + p3.hashCode());
        String s1 = "Aa";
        String s2 = "BB";
        System.out.println("s1：" + s1.hashCode() + "，s2：" + s2.hashCode());
    }
}
