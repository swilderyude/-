package com.yyds.unit6.demo;

import java.util.UUID;

public class Demo18UUID {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        // 移除掉横线
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
    }
}
