package com.yyds.unit13.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo8GeneratorId {
//    public static void main(String[] args) throws Exception {
//        User user = newInstance(User.class);
//        System.out.println("user的id为：" + user.getId());
//        Car car = newInstance(Car.class);
//        System.out.println("car的id为：" + car.getId());
//    }
    private static <T> T newInstance(Class<T> clazz) throws Exception {
        // 获取构造方法创建对象
        Constructor<T> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        T t = constructor.newInstance();
        // 获取所有字段
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            // 判断字段上是否有@Id注解
            if(field.isAnnotationPresent(Id.class)) {
                field.setAccessible(true);
                // 获取@Id注解
                Id id = field.getAnnotation(Id.class);
                // 获取value属性。注解属性的获取像是方法的调用
                int value = id.value();
                int multi = 1;
                for (int i = 0; i < value; i++) {
                    multi *= 10;
                }
                // 生成0-9999（value个长度的9）之间的随机数
                int idValue = (int) (Math.random() * multi);
                // 设置id值
                field.set(t, idValue);
            }
        }
        return t;
    }
}
