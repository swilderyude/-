package com.yyds.unit9.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo10CodeLine {
    private static int line = 0;

    public static void main(String[] args) {
        File root = new File("src/com/yyds");
        statisticLine(root);
        System.out.println("自学习java开始，我已经编写了" + line + "行代码");
    }

    // 统计行数
    private static void statisticLine(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File f : listFiles) {
                statisticLine(f);
            }
        } else {
            // 如果是文件，统计行数
            BufferedReader br = null;
            try {
                br = new BufferedReader(new FileReader(file));
                String s;
                // 一次读取一行，不为null说明读到了
                while ((s = br.readLine()) != null) {
                    line++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
