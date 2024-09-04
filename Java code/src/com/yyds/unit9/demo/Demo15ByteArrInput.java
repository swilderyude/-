package com.yyds.unit9.demo;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

public class Demo15ByteArrInput {
    public static void main(String[] args) throws Exception {
        byte[] arr = {-84, -19, 0, 5, 119, 24, 0, 0, 0, 123, 64, 9, 30, -72, 81, -21, -123, 31, 0, 10, 72, 101, 108, 108, 111, 87, 111, 114, 108, 100, 115, 114, 0, 24, 99, 111, 109, 46, 121, 121, 100, 115, 46, 117, 110, 105, 116, 57, 46, 100, 101, 109, 111, 46, 85, 115, 101, 114, 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 4, 76, 0, 3, 97, 103, 101, 116, 0, 19, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 73, 110, 116, 101, 103, 101, 114, 59, 76, 0, 2, 105, 100, 116, 0, 18, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 83, 116, 114, 105, 110, 103, 59, 76, 0, 4, 110, 97, 109, 101, 113, 0, 126, 0, 2, 76, 0, 3, 115, 101, 120, 113, 0, 126, 0, 2, 120, 112, 115, 114, 0, 17, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 73, 110, 116, 101, 103, 101, 114, 18, -30, -96, -92, -9, -127, -121, 56, 2, 0, 1, 73, 0, 5, 118, 97, 108, 117, 101, 120, 114, 0, 16, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 78, 117, 109, 98, 101, 114, -122, -84, -107, 29, 11, -108, -32, -117, 2, 0, 0, 120, 112, 0, 0, 0, 23, 116, 0, 1, 49, 116, 0, 6, -27, -68, -96, -28, -72, -119, 116, 0, 3, -25, -108, -73, 113, 0, 126, 0, 3};
        ByteArrayInputStream bais = new ByteArrayInputStream(arr);
        ObjectInputStream ois = new ObjectInputStream(bais);
        // 读取顺序必须按照写入顺序
        int a = ois.readInt();
        double b = ois.readDouble();
        String c = ois.readUTF();
        User user = (User) ois.readObject();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(user);
        // 因为字节数组流不涉及到外部系统，所以这里对象流其实也可以不关闭
        ois.close();
    }
}
