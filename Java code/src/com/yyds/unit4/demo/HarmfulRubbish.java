package com.yyds.unit4.demo;
public class HarmfulRubbish extends Rubbish {
    @Override
    public void classify() {
        System.out.println("有害垃圾");
    }
    public void handle() {
        System.out.println("有害垃圾必须要经过处理");
    }
}
