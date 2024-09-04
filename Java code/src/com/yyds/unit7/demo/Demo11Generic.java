package com.yyds.unit7.demo;
public class Demo11Generic {
    public static void main(String[] args) {
        // result1不需要指定泛型，因为泛型在继承时已经确定了
        Result1 result1 = new Result1();
        // 由于泛型已经是确定的了，data只能是String类型
        result1.setData("浙江温州");
        result1.showData();
        // Result2依然是泛型类
        Result2<Integer> result2 = new Result2<>();
        result2.setData(314);
        result2.showData();
    }
}
