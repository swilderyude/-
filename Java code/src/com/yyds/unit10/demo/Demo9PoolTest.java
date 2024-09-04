package com.yyds.unit10.demo;

import com.yyds.unit10.demo.utils.JdbcMySQLPool;
import com.yyds.unit10.demo.utils.PoolConnection;

import java.sql.Connection;
import java.sql.Statement;
import java.util.concurrent.CountDownLatch;

public class Demo9PoolTest {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        JdbcMySQLPool pool = new JdbcMySQLPool();
        // 多线程技术：一种计数器，可以用于记录线程执行完毕
        CountDownLatch latch = new CountDownLatch(2000);
        for (int i = 0; i < 2000; i++) {
            // 多线程技术：创建线程并执行
            new Thread(()->{
                try {
                    PoolConnection poolConnection = pool.getConnection();
                    Connection connection = poolConnection.getConnection();
//                    Connection connection = pool.getConnectionNoPool();
                    Statement statement = connection.createStatement();
                    // 测试性能只查询即可，不需要输出结果
                    statement.executeQuery("select * from user");
                    // 关闭连接，实际上是放回连接池
                    poolConnection.close();
                    statement.close();
//                    connection.close();
                }catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    latch.countDown();
                }
            }).start();
        }
        // 多线程技术：等待前面的线程执行完毕
        latch.await();
        long endTime = System.currentTimeMillis();
//        System.out.println("不使用连接池执行耗时：" + (endTime-start));
        System.out.println("使用连接池执行耗时：" + (endTime-start));
    }
}
