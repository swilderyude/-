package com.yyds.unit13.demo;
import java.lang.reflect.Field;
public class Demo3BuildId {
    public static Integer ID = 1;
    public static void main(String[] args) throws Exception {
        User user = new User();
        buildId(user);
        Car car = new Car();
        buildId(car);
        System.out.println("user的id：" + user.getId());
        System.out.println("car的id：" + car.getId());
    }
    public static void buildId(Object obj) throws Exception{
        // 获取class
        Class<?> clazz = obj.getClass();
        // 获取id变量
        Field id = clazz.getDeclaredField("id");
        // 如果id变量存在，并且类型是Integer
        if(id != null && id.getType() == Integer.class) {
            // 设置id值
            id.setAccessible(true);
            id.set(obj, ID++);
        }
    }
}
