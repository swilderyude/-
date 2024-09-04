package com.yyds.unit6.demo;

public class Demo5StringConstructor {
    public static void main(String[] args) {
        // 直接复制
        String s1 = "HelloWorld";
        String s2 = new String();
        String s3 = new String(s1);
        String s4 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        String s5 = new String(new byte[]{65, 66, 67, 68, 69});
        System.out.println("s1：" + s1);
        System.out.println("s2：" + s2);
        System.out.println("s3：" + s3);
        System.out.println("s4：" + s4);
        System.out.println("s5：" + s5);
    }
}
