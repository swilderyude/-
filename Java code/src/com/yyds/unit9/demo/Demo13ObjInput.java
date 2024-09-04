package com.yyds.unit9.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo13ObjInput {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("unit9/test4.txt"));
        User user = (User) ois.readObject();
        System.out.println(user);
        ois.close();
    }
}
