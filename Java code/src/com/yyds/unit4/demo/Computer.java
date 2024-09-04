package com.yyds.unit4.demo;
public class Computer implements USB3{
    @Override
    public void transfer() {
        System.out.println("电脑传输数据");
    }

    @Override
    public void slowTransfer() {
        System.out.println("电脑使用USB2.0协议低速传输");
    }

    @Override
    public void fastTransfer() {
        System.out.println("电脑使用USB3.0协议高速传输");
    }
}
