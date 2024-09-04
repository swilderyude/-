package com.yyds.unit9.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo9CopyFile {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream("unit9/abc.mp4"));
            bos = new BufferedOutputStream(new FileOutputStream("unit9/copy.mp4"));
            long start = System.currentTimeMillis();
            byte[] arr = new byte[1024];
            int len;
            while ((len = bis.read(arr)) != -1) {
                // 读了多少写多少，不要多写
                bos.write(arr, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("复制完毕，程序耗时：" + (end - start));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
