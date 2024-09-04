package com.yyds.unit4.demo;
public class Keyboard implements USB {
    @Override
    public void transfer() {
        System.out.println("键盘传输打字信息");
    }
}
