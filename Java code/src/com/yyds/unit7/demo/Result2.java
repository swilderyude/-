package com.yyds.unit7.demo;

// 继承时不指定泛型，而是将Result2定义成泛型类，可以理解成将泛型T作为数据类型传递给了Result的泛型
// 此时使用data变量时，依然是泛型变量
public class Result2<T> extends Result<T> {
    public void showData() {
        // 泛型在未确定时，可以作为一个未知的数据类型使用
        T data = getData();
        System.out.println("result1中data值为：" + data);
    }
}
