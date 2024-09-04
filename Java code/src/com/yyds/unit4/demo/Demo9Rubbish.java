package com.yyds.unit4.demo;
public class Demo9Rubbish {
    public static void main(String[] args) {
        Rubbish rubbish = new Rubbish();
        Rubbish dryRubbish = new DryRubbish();
        Rubbish wetRubbish = new WetRubbish();
        Rubbish recyclableRubbish = new RecyclableRubbish();
        Rubbish harmfulRubbish = new HarmfulRubbish();
        handleClassify(rubbish);
        handleClassify(dryRubbish);
        handleClassify(wetRubbish);
        handleClassify(recyclableRubbish);
        handleClassify(harmfulRubbish);
    }
    // 虽然参数是Rubbish，但由于多态的特性，可以传入Rubbish以及它的任意子类对象
    private static void handleClassify(Rubbish rubbish) {
        rubbish.classify();
    }
}
