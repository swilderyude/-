package com.yyds.unit4.demo;
public class DryRubbish extends Rubbish {
    @Override
    public void classify() {
        System.out.println("干垃圾");
    }
    // 干垃圾独有的方法
    public void showInfo() {
        System.out.println("干垃圾分类完可以直接扔");
    }
}
