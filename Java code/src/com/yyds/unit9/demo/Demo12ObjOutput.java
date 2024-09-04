package com.yyds.unit9.demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo12ObjOutput {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("unit9/test4.txt"));
        User user = new User();
        user.setId("1");
        user.setName("张三");
        user.setSex("男");
        user.setAge(23);
        oos.writeObject(user);
        oos.close();
    }
}
