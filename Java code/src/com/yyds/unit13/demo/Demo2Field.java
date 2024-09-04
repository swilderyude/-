package com.yyds.unit13.demo;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Demo2Field {
    public static void main(String[] args) throws Exception {
        User user = new User();
        Class<? extends User> userClass = user.getClass();
        // 获取所有public的成员变量
        Field[] fields = userClass.getFields();
        System.out.println("getFields");
        // stream+lambda输出
        Arrays.stream(fields).forEach(e-> System.out.print(e.getName()+" "));
        // 获取所有的成员变量
        Field[] declaredFields = userClass.getDeclaredFields();
        System.out.println("\ndeclaredFields");
        Arrays.stream(declaredFields).forEach(e-> System.out.print(e.getName()+" "));
        // 如果使用getField，会获取不到name
        Field name = userClass.getDeclaredField("name");
        // 去掉这行代码，再试试运行结果
        name.setAccessible(true);
        name.set(user, "张三");
        Object nameValue = name.get(user);
        System.out.println("\n"+nameValue);
    }
}
