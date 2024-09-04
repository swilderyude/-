package com.yyds.unit4.demo;

import javax.xml.ws.handler.HandlerResolver;

public class Demo10Rubbish {
    public static void main(String[] args) {
        Rubbish rubbish = new Rubbish();
        Rubbish dryRubbish = new DryRubbish();
        Rubbish wetRubbish = new WetRubbish();
        Rubbish recyclableRubbish = new RecyclableRubbish();
        Rubbish harmfulRubbish = new HarmfulRubbish();
        handleSelfMethod(rubbish);
        handleSelfMethod(dryRubbish);
        handleSelfMethod(wetRubbish);
        handleSelfMethod(recyclableRubbish);
        handleSelfMethod(harmfulRubbish);
    }
    // 虽然参数是Rubbish，但由于多态的特性，可以传入Rubbish以及它的任意子类对象
    private static void handleSelfMethod(Rubbish rubbish) {
        // 先判断rubbish是否为指定类型
        if(rubbish instanceof DryRubbish) {
            // 如果是，向下转型，可以调用独有的方法
            DryRubbish dryRubbish = (DryRubbish) rubbish;
            dryRubbish.showInfo();
        }else if(rubbish instanceof RecyclableRubbish) {
            RecyclableRubbish recyclableRubbish = (RecyclableRubbish) rubbish;
            recyclableRubbish.handle();
        }else if(rubbish instanceof HarmfulRubbish) {
            HarmfulRubbish harmfulRubbish = (HarmfulRubbish) rubbish;
            harmfulRubbish.handle();
        }else {
            System.out.println("传入的"+rubbish+"没有独有的方法");
        }
    }
}
