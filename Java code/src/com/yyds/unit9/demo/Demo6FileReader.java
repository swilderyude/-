package com.yyds.unit9.demo;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo6FileReader {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("unit9/test1.txt");
            // 数组定义多大，一次性就读取最多多少字符，一般是1024的倍数
            char[] b = new char[1024];
            // 记录每次读取的长度
            int len;
            // 每次读取b.length个数据到b中，将读取长度赋值给len，如果长度不是-1，说明读取到了内容
            while ((len = reader.read(b)) != -1) {
                // 这里必须要指定字符串转换的长度，尽管数组长度是1024，但最终可能剩的字符不足1024
                System.out.println(new String(b, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
