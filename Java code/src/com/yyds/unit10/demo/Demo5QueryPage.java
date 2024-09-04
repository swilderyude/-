package com.yyds.unit10.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo5QueryPage {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&useSSL=false&charsetUnicode=UTF8";
        String user = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement statement = conn.createStatement();
        // 查询总条数
        String sql = "select count(*) from user";
        ResultSet resultSet = statement.executeQuery(sql);
        // 游标移动一位
        resultSet.next();
        int totalCount = resultSet.getInt(1);
        resultSet.close();
        int pageSize = 3;
        // 每页3条计算总页数，即使最后剩1条数据，也需要另查一页
        int totalPage = (int) Math.ceil((totalCount * 1.0 / pageSize));
        System.out.println("总条数：" + totalCount+"，总页数：" + totalPage);
        // 再次使用statement分页查询
        for (int page = 1; page <= totalPage; page++) {
            System.out.println("===========第" + page + "页============");
            int offset = (page - 1) * pageSize;
            sql = "select* from user limit " + offset + ", " + pageSize;
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                // 取出第1列，即id。注意，ResultSet中列的索引是从1开始，而不是0
                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String userPassword = resultSet.getString(3);
                // 除了根据索引外，还可以根据列名获取
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String sex = resultSet.getString("sex");
                String address = resultSet.getString(7);
                System.out.println("id：" + id + "，用户名：" + username + "，密码：" + userPassword +
                        "，姓名：" + name + "，年龄：" + age + "，性别：" + sex + "，地址：" + address);
            }
            resultSet.close();
        }

        statement.close();
        conn.close();
    }
}
