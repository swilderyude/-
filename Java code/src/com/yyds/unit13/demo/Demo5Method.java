package com.yyds.unit13.demo;

import java.lang.reflect.Method;

public class Demo5Method {
    public static void main(String[] args) throws Exception {
        User user = new User();
        Class<? extends User> userClass = user.getClass();
        // 获取sleep方法
        Method sleep = userClass.getDeclaredMethod("sleep");
        // 执行user对象的sleep方法
        Object sleepResult = sleep.invoke(user);
        System.out.println("返回值：" + sleepResult);
        // 获取eat方法
        Method eat = userClass.getDeclaredMethod("eat");
        // 暴力反射
        eat.setAccessible(true);
        Object eatResult = eat.invoke(user);
        System.out.println("返回值：" + eatResult);
    }
}
