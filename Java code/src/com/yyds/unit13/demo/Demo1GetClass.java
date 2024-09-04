package com.yyds.unit13.demo;

public class Demo1GetClass {
    public static void main(String[] args) throws ClassNotFoundException {
        // 方式1：使用Class.forName，不推荐这种方式，因为要保证全类目一定完全写对，否则会抛出ClassNotFoundException
        Class<?> clazz1 = Class.forName("com.yyds.unit13.demo.User");
        System.out.println(clazz1);
        // 方式2：每个类中都有class属性，可以使用类名.class来获取class对象。推荐这种方式
        Class<User> clazz2 = User.class;
        System.out.println(clazz2);
        // 方式3：每个对象中都有getClass()方法，可以使用对象名.getClass()来获取class对象。也推荐这种方式
        User user = new User();
        Class<? extends User> clazz3 = user.getClass();
        System.out.println(clazz3);
        // 证明三个Class对象是同一个对象
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
