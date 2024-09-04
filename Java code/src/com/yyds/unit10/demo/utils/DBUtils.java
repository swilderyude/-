package com.yyds.unit10.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
    private static String driverClass = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&useSSL=false&charsetUnicode=UTF8";
    private static String user = "root";
    private static String password = "123456";

    // 私有化构造方法，不让外界创建对象
    private DBUtils() {
    }

    // 静态代码块加载驱动，保证驱动只会加载一次
    static {
        try {
            Class.forName(driverClass);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // 获取JDBC连接
    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    // Connection、Statement、ResultSet接口都继承了AutoCloseable
    // 这里使用可变参数，就可以传入任意个数需要关闭的资源。
    public static void close(AutoCloseable... resources) {
        for (AutoCloseable resource : resources) {
            try {
                resource.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
