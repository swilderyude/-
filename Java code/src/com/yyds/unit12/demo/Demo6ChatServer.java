package com.yyds.unit12.demo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
public class Demo6ChatServer {
    // 记录连接用户。key为昵称，value为对应Socket对象的输出流
    private static final Map<String, BufferedWriter> registerMap = new ConcurrentHashMap<>();
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
                        System.out.println("欢迎 " + clientName + " 加入聊天室");
                        // 注册用户
                        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        registerMap.put(clientName, bw);
                        String str;
                        while ((str = br.readLine()) != null) {
         // 只要接收到客户端发来的消息，就将这条消息发送给除了该用户以外的所有客户端
                            for (Map.Entry<String, BufferedWriter> entry : registerMap.entrySet()) {
                                if(entry.getKey().equals(clientName)) {
                                    // 消息的发送者不需要再次发送
                                    continue;
                                }
                                BufferedWriter writer = entry.getValue();
                                writer.write(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+ "  " + clientName + ":\n" + str + "\n");
                                writer.flush();
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}