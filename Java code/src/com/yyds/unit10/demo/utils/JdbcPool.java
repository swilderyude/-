package com.yyds.unit10.demo.utils;

import java.sql.Connection;
public interface JdbcPool {
    // 从连接池中获取连接
    PoolConnection getConnection();
    // 获取连接（不从连接池）
    Connection getConnectionNoPool();
}
