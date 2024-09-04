package com.yyds.unit4.demo;
public class Demo15Computer {
    public static void main(String[] args) {
        USB usb = new Computer();
        USB2 usb2 = new Computer();
        USB3 usb3 = new Computer();
        usb.transfer();
        usb2.slowTransfer();
        usb3.fastTransfer();
    }
}
