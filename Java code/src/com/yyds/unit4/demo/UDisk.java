package com.yyds.unit4.demo;
public class UDisk implements USB{
    @Override
    public void transfer() {
        System.out.println("U盘传输文件数据");
    }
}
