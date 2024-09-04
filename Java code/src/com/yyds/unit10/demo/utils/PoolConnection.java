package com.yyds.unit10.demo.utils;

import java.sql.Connection;

public class PoolConnection {
    private Connection connection;
    // 是否被使用
    private boolean use;

    public PoolConnection(Connection connection, boolean use) {
        this.connection = connection;
        this.use = use;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public boolean isUse() {
        return use;
    }

    public void setUse(boolean use) {
        this.use = use;
    }
    // 关闭连接实际上只要把状态设置为未使用即可
    public void close() {
        this.use = false;
    }
}
