package com.yyds.unit13.demo;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Demo4Constructor {
    public static void main(String[] args) throws Exception {
        Class<User> userClass = User.class;
        // 获取全部的构造方法
        Constructor<?>[] constructors = userClass.getDeclaredConstructors();
        System.out.println("获取所有构造方法：");
        for (Constructor<?> constructor : constructors) {
            // 暴力反射
            constructor.setAccessible(true);
            System.out.println("name："+constructor.getName());
            System.out.println("参数个数：" + constructor.getParameterCount());
            System.out.println("参数类型：" + Arrays.toString(constructor.getParameterTypes()));
        }
        System.out.println("获取指定的构造方法：");
        // 这里我们直接获取空参构造
        Constructor<User> constructor = userClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        System.out.println("name："+constructor.getName());
        System.out.println("参数个数：" + constructor.getParameterCount());
        System.out.println("参数类型：" + Arrays.toString(constructor.getParameterTypes()));
        // 直接创建对象，该方法的参数个数、类型和顺序必须与getDeclaredConstructor时完全一致
        User user = constructor.newInstance();
        System.out.println(user);

    }
}
