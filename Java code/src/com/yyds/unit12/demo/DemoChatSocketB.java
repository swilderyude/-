package com.yyds.unit12.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class DemoChatSocketB {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // 创建Socket对象，连接到本地的8080端口
        Socket socket = new Socket("127.0.0.1", 8080);
        // 获取输出流，往服务端写消息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        // 获取输入流，用来接受服务端传来的消息
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // 为了保证随时可以获取消息，读应该开启新的线程
        new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    String str;
                    while ((str = br.readLine()) != null) {
                        System.out.println(str);
                    }
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        bw.write("关羽");
        bw.write("\n");
        bw.flush();
        // 不停的输入
        while (true) {
            String next = sc.nextLine();
            bw.write(next);
            bw.write("\n");
            bw.flush();
        }
    }
}
