package com.yyds.unit10.demo;

import com.yyds.unit10.demo.utils.DBUtils;

import java.sql.Connection;
import java.sql.Statement;

public class Demo8Balance {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        String sql1 = "update account set account=account-1000 where id=1";
        String sql2 = "update account set account=account+1000 where id=2";
        try {
            connection = DBUtils.getConnection();
            // ①关闭事务自动提交
//            connection.setAutoCommit(false);
            statement = connection.createStatement();
            statement.executeUpdate(sql1);
            // ②抛出异常
             int a = 1 / 0;
            statement.executeUpdate(sql2);
            // ①提交事务
            connection.commit();
        }catch (Exception e) {
            e.printStackTrace();
//            try {
//                // ②如果出现异常，回滚事务
//                connection.rollback();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
        }finally {
            DBUtils.close(statement, connection);
        }
    }
}
