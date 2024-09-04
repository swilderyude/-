package com.yyds.unit9.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo8CopyFile {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("unit9/abc.mp4");
            os = new FileOutputStream("unit9/copy.mp4");
            long start = System.currentTimeMillis();
            byte[] arr = new byte[1024];
            int len;
            while ((len = is.read(arr)) != -1) {
                // 读了多少写多少，不要多写
                os.write(arr, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("复制完毕，程序耗时：" + (end - start));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
