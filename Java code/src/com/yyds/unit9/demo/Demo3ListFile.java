package com.yyds.unit9.demo;

import java.io.File;

public class Demo3ListFile {
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\nginx-1.17.4");
        printFile(file);
    }
    // 递归输出文件夹和文件
    private static void printFile(File file) {
        System.out.println(file.getAbsolutePath());
        // 如果是目录，就递归调用
        if(file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File f : listFiles) {
                printFile(f);
            }
        }
    }
}
