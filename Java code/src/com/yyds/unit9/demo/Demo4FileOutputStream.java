package com.yyds.unit9.demo;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
public class Demo4FileOutputStream {
    public static void main(String[] args) {
        OutputStream os = null;
        try {
            os = new FileOutputStream("unit9/test1.txt");
            os.write("你好，Java".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 流使用完毕后一定要关闭，finally保证一定能够执行
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
