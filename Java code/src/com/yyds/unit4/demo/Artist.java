package com.yyds.unit4.demo;
public class Artist implements Acting, Sing {
    @Override
    public void action() {
        System.out.println("艺人在拍电影");
    }

    @Override
    public void sing() {
        System.out.println("艺人在唱歌");
    }
}
