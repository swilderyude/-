package com.yyds.unit12.demo;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class DemoSocket {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // 创建Socket对象，连接到本地的8080端口
        Socket socket = new Socket("127.0.0.1", 8080);
        // 获取输出流，往服务端写消息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("客户端A");
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
