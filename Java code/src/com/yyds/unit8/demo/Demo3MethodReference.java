package com.yyds.unit8.demo;

public class Demo3MethodReference {
    public static void main(String[] args) {
        NoReturnOneParam noReturnOneParam = System.out::println;
        System.out.print("单参数无返回值改方法引用运行结果：");
        noReturnOneParam.method(2);
        ReturnMultiParam returnMultiParam = Integer::sum;
        System.out.print("多参数有返回值改方法引用运行结果：");
        System.out.println(returnMultiParam.method(2, 3));
    }
}
