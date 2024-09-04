package com.yyds.unit7.demo;

// 继承时指定泛型是String，对于Result1而言，data变量就是String类型的
public class Result1 extends Result<String> {
    public void showData() {
        String data = getData();
        System.out.println("result1中data值为：" + data);
    }
}
