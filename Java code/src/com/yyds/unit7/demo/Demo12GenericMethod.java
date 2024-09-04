package com.yyds.unit7.demo;
public class Demo12GenericMethod {
    public static void main(String[] args) {
        String s = "HelloWorld";
        // 传入字符串参数，则method的泛型T会被视为String，返回值也变成String
        String data1 = method(s);
        Result1 result1 = new Result1();
        result1.setData(s);
        // 传入Result1参数，则method的泛型T会被视为Result1
        Result1 data2 = method(result1);
    }
    // 泛型方法，指定泛型为T，返回值为T，参数为T
    private static <T> T method(T t) {
        System.out.println("接收到参数：" + t.toString());
        return t;
    }
}
