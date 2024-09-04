package com.yyds.unit4.demo;

public class Demo16USB {
    public static void main(String[] args) {
        USB usb = new Keyboard();
        USB.install();
        usb.transfer();
        usb.charge();
    }
}
