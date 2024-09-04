package com.yyds.unit4.demo;
public class Mouse implements USB{
    @Override
    public void transfer() {
        System.out.println("鼠标传输点击和滚轮操作");
    }
}
