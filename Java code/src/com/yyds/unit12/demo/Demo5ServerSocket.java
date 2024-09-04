package com.yyds.unit12.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class Demo5ServerSocket {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("服务端启动完毕，监听连接...");
        // 主线程只负责监听连接
        while (true) {
            Socket socket = serverSocket.accept();
            // 一旦有连接建立，立即创建线程处理
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                        String clientName = br.readLine();
                        System.out.println(clientName + "连接成功");
                        String str;
                        while ((str = br.readLine()) != null) {
                            System.out.println(clientName + "：" + str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}