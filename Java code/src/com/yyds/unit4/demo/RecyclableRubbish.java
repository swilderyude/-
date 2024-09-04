package com.yyds.unit4.demo;
public class RecyclableRubbish extends Rubbish {
    @Override
    public void classify() {
        System.out.println("可回收垃圾");
    }
    public void handle() {
        System.out.println("可回收垃圾可以变废为宝");
    }
}
