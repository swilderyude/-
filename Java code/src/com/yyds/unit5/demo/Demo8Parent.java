package com.yyds.unit5.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo8Parent {
    public static void main(String[] args) {
    }
    class Parent {
        public void method1() throws IOException {}
    }
    class Child extends Parent {
        // 编译错误
        @Override
        public void method1() throws FileNotFoundException {}
    }
}
