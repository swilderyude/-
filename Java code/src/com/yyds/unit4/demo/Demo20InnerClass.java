package com.yyds.unit4.demo;
public class Demo20InnerClass {
    public static void main(String[] args) {
        // 直接new接口并重写它的抽象方法。这里并不是new了USB的对象，而是USB的一个子类的对象，只不过这个子类是匿名的
        accessUsb(new USB() {
            @Override
            public void transfer() {
                System.out.println("未知的USB设备");
            }
        });
    }
    // 接入usb设备
    public static void accessUsb(USB usb) {
        USB.install();
        usb.charge();
        usb.transfer();
    }
}
