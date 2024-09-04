package com.yyds.unit12.demo;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
public class Demo8HttpApiSina {
    public static void main(String[] args) throws IOException {
        // 接口地址
        String api = "https://interface.sina.cn/news/wap/fymap2020_data.d.json";
        // 创建URL对象
        URL url = new URL(api);
        // 开启一个HttpUrlConnection对象
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        // 设置请求方式，默认是GET
        urlConnection.setRequestMethod("GET");
        // 获得状态码
        int code = urlConnection.getResponseCode();
        System.out.println("请求状态码为：" + code);
        // 状态码为200则表示请求成功
        if (code == 200) {
            // 获取输入流进行解析
            InputStream is = urlConnection.getInputStream();
            byte[] b = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while ((len = is.read(b)) != -1) {
                sb.append(new String(b, 0, len));
            }
            is.close();
            // 断开连接
            urlConnection.disconnect();
            System.out.println(sb);
        } else if (code == 404) {
            System.out.println("地址错误！");
        } else {
            System.out.println("系统内部错误");
        }
    }
}