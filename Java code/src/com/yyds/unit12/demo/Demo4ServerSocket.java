package com.yyds.unit12.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
// 服务端改造
public class Demo4ServerSocket {
    public static void main(String[] args) throws IOException {
        // 创建ServerSocket，绑定8080端口
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("服务端启动完毕，监听连接...");
        // 监听客户端的连接。如果没有连接，就会在这里阻塞。如果有连接，就会获取到socket继续往后执行
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(br.readLine()+"连接成功");
        String str;
        // 循环读取客户端发送的数据
        while ((str = br.readLine()) != null) {
          System.out.println(str);
        }
    }
}