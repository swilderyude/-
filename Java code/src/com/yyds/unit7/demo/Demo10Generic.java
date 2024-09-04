package com.yyds.unit7.demo;

public class Demo10Generic {
    public static void main(String[] args) {
        Result<String> result1 = new Result<>();
        result1.setData("HelloWorld");
        // 指定String泛型，data就会被视为String类型
        String data1 = result1.getData();
        System.out.println("泛型为String：" + data1);

        Result<Integer> result2 = new Result<>();
        result2.setData(10086);
        // 指定Integer泛型，data就会被视为Integer类型
        Integer data2 = result2.getData();
        System.out.println("泛型为Integer：" + data2);
    }
}
