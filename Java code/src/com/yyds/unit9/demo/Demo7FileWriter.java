package com.yyds.unit9.demo;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo7FileWriter {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("unit9/test2.txt");
            // 不管是字符串还是字符数组都可以写
            writer.write("武汉加油！");
            writer.write("上海加油！".toCharArray());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 流使用完毕后一定要关闭，finally保证一定能够执行
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
