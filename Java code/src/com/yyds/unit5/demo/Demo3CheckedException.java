package com.yyds.unit5.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Demo3CheckedException {
    public static void main(String[] args) throws FileNotFoundException {
        // IO流，后面章节会有涉及
        InputStream is = new FileInputStream("D:\\abc.txt");
    }
}
