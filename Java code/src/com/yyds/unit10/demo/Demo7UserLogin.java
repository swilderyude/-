package com.yyds.unit10.demo;

import com.yyds.unit10.demo.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Demo7UserLogin {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        // next方法会以空格为终止符，而nextLine不会。实际中输入框可能会允许输入空格，所以使用nextLine模拟出问题
        String username = scanner.nextLine();
        System.out.print("请输入密码：");
        String password = scanner.nextLine();
        // 使用?作为占位符，并且不用关注具体的数据类型
        String sql = "select * from user where username=? and password=?";
        Connection connection = DBUtils.getConnection();
        // 预编译，要在获取PreparedStatement的时候就传入SQL
        PreparedStatement statement = connection.prepareStatement(sql);
        // 设置参数，索引从1开始
        statement.setString(1, username);
        statement.setString(2, password);
        // 执行SQL。由于前面已经传入了SQL，这里的executeQuery就不需要再传递SQL了
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            System.out.println("登录成功");
        } else {
            System.out.println("用户名或密码错误");
        }
    }
}
