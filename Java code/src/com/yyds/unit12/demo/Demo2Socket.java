package com.yyds.unit12.demo;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
public class Demo2Socket {
    public static void main(String[] args) throws IOException {
        // 创建Socket对象，连接到本地的8080端口
        Socket socket = new Socket("127.0.0.1", 8080);
        // 获取输出流，往服务端写消息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String str = "HelloWorld!";
        bw.write(str);
        // 刷新输出流
        bw.flush();
        // 关闭输出流，告诉服务端消息发送完毕
        socket.shutdownOutput();
    }
}