package com.yyds.unit9.demo;
import java.io.File;
public class Demo1File {
    public static void main(String[] args) {
        File file = new File("unit9/abc.txt");
        System.out.println("是否存在：" + file.exists());
        System.out.println("是否为文件夹：" + file.isDirectory());
        System.out.println("是否为文件：" + file.isFile());
        System.out.println("文件长度：" + file.length());
        System.out.println("文件名：" + file.getName());
        System.out.println("创建时路径：" + file.getPath());
        System.out.println("绝对路径：" + file.getAbsolutePath());
    }
}
