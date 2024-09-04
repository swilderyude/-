package com.yyds.unit4.demo;
public interface USB {
    void transfer();
    default void charge()  {
        System.out.println("USB接口正在充电");
    }
    static void install() {
        System.out.println("正在安装USB驱动");
    }
}
