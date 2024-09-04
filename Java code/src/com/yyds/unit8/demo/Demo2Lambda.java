package com.yyds.unit8.demo;
public class Demo2Lambda {
    public static void main(String[] args) {
        // 方法体内只有一行代码，省略大括号和分号
        NoReturnNoParam noReturnNoParam = ()-> System.out.println("我是无参数无返回值的函数式接口");
        noReturnNoParam.method();
        // 参数只有一个，省略小括号。并且方法体只有一行代码，省略大括号和分号
        NoReturnOneParam noReturnOneParam = a-> System.out.println("单参数无返回值传入的参数是：" + a);
        noReturnOneParam.method(1);
        // 参数有两个，不能省略小括号，但是方法体只有一行代码，可以省略大括号和分号
        NoReturnMultiParam noReturnMultiParam = (a, b) -> System.out.println("多参数无返回值计算结果："  + (a + b));
        noReturnMultiParam.method(1,2);
        // 方法体只有一行return语句，省略return、大括号、分号
        ReturnNoParam returnNoParam = () -> 12;
        int result1 = returnNoParam.method();
        System.out.println(12);
        // 参数只有一个，省略小括号。方法体只有一行return语句，省略大括号和分号
        ReturnOneParam returnOneParam = a -> a+1;
        int result2 = returnOneParam.method(3);
        System.out.println(result2);
        // 省略大括号和分号
        ReturnMultiParam returnMultiParam = (a, b)-> a * b;
        int result3 = returnMultiParam.method(3, 5);
        System.out.println(result3);
    }
}
