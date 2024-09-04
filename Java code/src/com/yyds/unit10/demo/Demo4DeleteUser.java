package com.yyds.unit10.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Demo4DeleteUser {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&useSSL=false&charsetUnicode=UTF8";
        String user = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement statement = conn.createStatement();
        String sql = "delete from user where id=3";
        statement.executeUpdate(sql);
        statement.close();
        conn.close();
    }
}
