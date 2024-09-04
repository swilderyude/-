package com.yyds.unit6.demo;

import java.util.Arrays;

public class Demo7StringReplace {
    public static void main(String[] args) {
        String str = "北京、上海、广州、深圳、杭州、曹县";
        // 使用顿号分割字符串
        String[] strs = str.split("、");
        System.out.println(Arrays.toString(strs));
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        // 将北京替换成BeiJing，这里得到的是新字符串，str并不会改变
        String str2 = str.replace("北京", "Bei Jing");
        System.out.println(str2);
        String upperCase = str2.toUpperCase();
        String lowerCase = str2.toLowerCase();
        System.out.println(upperCase);
        System.out.println(lowerCase);
        // 从索引2截取到6-1处
        String str3 = str2.substring(2, 6);
        System.out.println(str3);
    }
}
