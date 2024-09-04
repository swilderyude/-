package com.yyds.unit12.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class DemoInetAddress {
    public static void main(String[] args) throws UnknownHostException {
        // 获得本地主机的相关信息
        InetAddress ia = InetAddress.getLocalHost();
        // 获取本地ip地
        System.out.println("本机IP地址："+ia.getHostAddress());
        // 获取本地主机名
        System.out.println("本机主机名："+ia.getHostName());
        // 获取主机名为DESKTOP-BDLPKS9的ip地址
        System.out.println("DESKTOP-BDLPKS9的IP地址："+InetAddress.getByName("DESKTOP-BDLPKS9").getHostAddress());
        // 获得指定域名的主机信息
        System.out.println("百度的IP地址："+InetAddress.getByName("www.baidu.com"));
        // 获得本地PC机名为DESKTOP-BDLPKS9的所有ip地址
        InetAddress[] ias = InetAddress.getAllByName("DESKTOP-BDLPKS9");
        //如果有一张网卡，得到的第一个是一个IPV4的IP地址，第二个是IPV6的地址
        System.out.println("DESKTOP-BDLPKS9的所有IP地址");
        for (InetAddress i : ias) {
            System.out.println(i.getHostAddress());
        }
    }
}
