package com.yyds.unit4.demo;
public class Demo8Rubbish {
    public static void main(String[] args) {
        Rubbish rubbish = new Rubbish();
        Rubbish dryRubbish = new DryRubbish();
        Rubbish wetRubbish = new WetRubbish();
        Rubbish recyclableRubbish = new RecyclableRubbish();
        Rubbish harmfulRubbish = new HarmfulRubbish();
        rubbish.classify();
        dryRubbish.classify();
        wetRubbish.classify();
        recyclableRubbish.classify();
        harmfulRubbish.classify();
    }
}
