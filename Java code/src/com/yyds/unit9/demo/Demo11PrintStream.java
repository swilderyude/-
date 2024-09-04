package com.yyds.unit9.demo;

import java.io.PrintWriter;

public class Demo11PrintStream {
    public static void main(String[] args) throws Exception {
        Object[] arr = {100, true, "你好Java", 'c', 3.14};
        PrintWriter ps = new PrintWriter("unit9/test3.txt");
        for (Object o : arr) {
            ps.println(o);
        }
        ps.close();
    }
}
