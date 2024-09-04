package com.yyds.unit10.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Demo1QueryUser {
    public static void main(String[] args) throws Exception {
        // 使用Class.forName加载驱动类。
        Class.forName("com.mysql.jdbc.Driver");
        // 设置数据库连接和编码
        String url = "jdbc:mysql://localhost:3306/testdb?useUnicode=true&useSSL=false&charsetUnicode=UTF8";
        String user = "root";
        String password = "123456";
        // 指定连接地址、用户名、密码创建数据库连接
        Connection conn = DriverManager.getConnection(url, user, password);
        // 创建SQL执行者对象
        Statement statement = conn.createStatement();
        String sql = "select * from user";
        ResultSet resultSet = statement.executeQuery(sql);
        // 只要ResultSet中还存在下一行数据，就取出这条数据
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
        statement.close();
        conn.close();
    }
}
