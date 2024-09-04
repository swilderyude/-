package com.yyds.unit4.demo;
public class Demo19InnerClass {
    public static void main(String[] args) {
        class Printer implements USB {
            @Override
            public void transfer() {
                System.out.println("打印机传输待打印文件信息");
            }
        }
        USB usb = new Printer();
        usb.transfer();
        usb.charge();
    }
}
