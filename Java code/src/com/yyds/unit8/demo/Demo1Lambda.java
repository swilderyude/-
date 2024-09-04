package com.yyds.unit8.demo;
public class Demo1Lambda {
    public static void main(String[] args) {
        // 这里其实相当于直接new匿名内部类，大括号内的其实就是匿名内部类的方法实现
        NoReturnNoParam noReturnNoParam = ()->{
            System.out.println("我是无参数无返回值的函数式接口");
        };
        noReturnNoParam.method();
        // Lambda中的参数不需要写参数类型，编译期会进行推断
        NoReturnOneParam noReturnOneParam = (a)->{
            System.out.println("单参数无返回值传入的参数是：" + a);
        };
        noReturnOneParam.method(1);
        NoReturnMultiParam noReturnMultiParam = (a, b) ->{
            System.out.println("多参数无返回值计算结果："  + (a + b));
        };
        noReturnMultiParam.method(1,2);
        ReturnNoParam returnNoParam = () ->{
            return 12;
        };
        int result1 = returnNoParam.method();
        System.out.println(12);
        ReturnOneParam returnOneParam = (a) ->{
            return a+1;
        };
        int result2 = returnOneParam.method(3);
        System.out.println(result2);
        ReturnMultiParam returnMultiParam = (a, b)->{
            return a * b;
        };
        int result3 = returnMultiParam.method(3, 5);
        System.out.println(result3);
    }
}
