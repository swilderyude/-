package com.yyds.unit4.demo;
public class Demo13USB {
    public static void main(String[] args) {
        USB mouse = new Mouse();
        USB keyboard = new Keyboard();
        USB disk = new UDisk();
        mouse.transfer();
        keyboard.transfer();
        disk.transfer();
    }
}
