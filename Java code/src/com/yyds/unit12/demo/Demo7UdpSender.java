package com.yyds.unit12.demo;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class Demo7UdpSender {
    public static void main(String[] args) {
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            String str = "HelloWorld!";
            byte[] data = str.getBytes();
      // UDP使用数据包传输，这里创建一个数据包对象，指定将数据发送到本地的1234端口
            DatagramPacket pck = new DatagramPacket(data, 0, data.length, InetAddress.getLocalHost(), 1234);
            datagramSocket.send(pck);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}