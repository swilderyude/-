package com.yyds.unit6.demo;

public class Demo10StringBuffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("北京");
        // 拼接字符串后，buffer内容就会改变，获取到的返回值也是最新的
        StringBuffer buffer2 = buffer.append("上海");
        System.out.println(buffer);
        System.out.println(buffer2);
        // 事实上，buffer和buffer2是同一个对象
        System.out.println(buffer == buffer2);
        buffer.append("广州");
        buffer.append("深圳");
        buffer.append("杭州");
        buffer.append("合肥");
        System.out.println(buffer);
        buffer.delete(2,5);
        System.out.println(buffer);
        buffer.replace(2,4, "HelloWorld");
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        buffer.setLength(3);
        System.out.println(buffer);
    }
}
