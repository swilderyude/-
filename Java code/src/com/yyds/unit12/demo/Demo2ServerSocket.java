package com.yyds.unit12.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class Demo2ServerSocket {
    public static void main(String[] args) throws IOException {
        // 创建ServerSocket，绑定8080端口
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("服务端启动完毕，监听连接...");
        // 监听客户端的连接。如果没有连接，就会在这里阻塞。如果有连接，就会获取到socket继续往后执行
        Socket socket = serverSocket.accept();
        System.out.println("连接成功");
        // 获取输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // 读取一行数据
        String str = br.readLine();
        System.out.println(str);
    }
}