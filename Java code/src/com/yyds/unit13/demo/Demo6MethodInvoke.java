package com.yyds.unit13.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Demo6MethodInvoke {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        User user = new User();
        user.setId(123);
        Object id = invokeMethod(user, "getId");
        System.out.println(id);
        Car car = new Car();
        invokeMethod(car, "run");
        // 执行一个不存在的方法
        invokeMethod(car, "start");
    }
    private static Object invokeMethod(Object obj, String methodName, Object... args)
            throws InvocationTargetException, IllegalAccessException {
        long startTime = System.currentTimeMillis();
        Class<?> objClass = obj.getClass();
        System.out.println("正在执行方法：" + objClass + "." + methodName);
        System.out.println("参数列表：" + Arrays.toString(args));
        // Stream获取参数类型列表
        Class<?>[] parameterTypes = Arrays.stream(args).map(Object::getClass).toArray(Class<?>[]::new);
        // 获取方法
        Method method;
        try {
            method = objClass.getDeclaredMethod(methodName, parameterTypes);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("方法：" + methodName + "不存在！");
        }
        method.setAccessible(true);
        // 执行
        Object result = method.invoke(obj, args);
        System.out.println("方法返回值：" + result);
        long endTime = System.currentTimeMillis();
        System.out.println("方法耗时：" + (endTime - startTime) + "毫秒");
        return result;
    }
}
