package com.yyds.unit9.demo;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Demo14ByteArrOutput {
    public static void main(String[] args) throws Exception {
        // 创建字节数组流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // 将字节数组流作为“数据源”提供给对象流，取代文件的作用
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        // 使用对象流操作数据源
        oos.writeInt(123);
        oos.writeDouble(3.14);
        // 写字符串
        oos.writeUTF("HelloWorld");
        User user = new User();
        user.setId("1");
        user.setName("张三");
        user.setSex("男");
        user.setAge(23);
        oos.writeObject(user);
        oos.writeObject(user);
        // 将数据刷到字节数组流中
        oos.flush();
        // 获取作为数据源的字节数组流中的数据
        byte[] array = baos.toByteArray();
        System.out.println(Arrays.toString(array));
    }
}
