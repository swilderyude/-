package com.yyds.unit12.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class DemoUdpReceiver {
    public static void main(String[] args) {
        try {
            // 接收方指定监听1234端口
            DatagramSocket datagramSocket = new DatagramSocket(1234);
            // UDP以数据包的形式发送，因此需要指定这个包的大小
            byte[] data = new byte[16];
            // 数据包对象，用于接收发送来的数据
            DatagramPacket packet = new DatagramPacket(data, 0, data.length);
            // 将数据封装到packet中
            datagramSocket.receive(packet);
            // 参数1：接收方包的数据，参数2：偏移量(0)，参数3：接收方包数据长度
            String str = new String(packet.getData(), packet.getOffset(), packet.getLength());
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
