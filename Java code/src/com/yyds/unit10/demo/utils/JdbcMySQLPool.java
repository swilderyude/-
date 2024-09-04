package com.yyds.unit10.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;

public class JdbcMySQLPool implements JdbcPool {
    private static String driverClass = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&useSSL=false&charsetUnicode=UTF8";
    private static String user = "root";
    private static String password = "123456";
    // 默认连接数，程序启动后，连接池内默认会创建4个连接
    private static int initConnection = 4;
    // 最大连接数，当4个连接不足以处理数据库操作时，会继续创建连接，最多创建到20个
    private static int maxConnection = 20;
    // 这里要使用线程安全的类，线程问题请参考第11章
    private static List<PoolConnection> pool = new Vector<>();

    static {
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 默认创建指定个数的连接
        createConnections(initConnection);
    }

    // synchronized的作用是保证线程安全，具体介绍详见第11章
    @Override
    public synchronized PoolConnection getConnection() {
        // 无限循环，每次循环都尝试从连接池中获取连接，如果获取不到，下次依然再尝试获取
        while (true) {
            for (PoolConnection poolConnection : pool) {
                if (poolConnection.isUse()) {
                    // 使用中的不获取
                    continue;
                }
                // 找到一个未使用的，状态改为已使用，并返回
                poolConnection.setUse(true);
                return poolConnection;
            }
            // 程序运行到此处，说明连接池中所有的连接都已使用。判断当前连接池中连接数是否到达最大连接数
            // 如果没有，就创建1个连接，然后重新尝试获取
            if (pool.size() < maxConnection) {
                createConnections(1);
            }
        }
    }

    // 创建指定个数的连接，放到连接池中
    private static void createConnections(int count) {
        for (int i = 0; i < count; i++) {
            // 连接池中连接个数已经超过了最大连接数，不允许再创建
            if (maxConnection > 0 && pool.size() >= maxConnection) {
                throw new RuntimeException("连接池中连接数量已经达到最大值");
            }
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                // 将连接放入到连接池中
                pool.add(new PoolConnection(connection, false));
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Connection getConnectionNoPool() {
        try {
            // 不走线程池，正常创建连接
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
