package com.yyds.unit10.demo;

import com.yyds.unit10.demo.utils.DBUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @Author: 杨德石
 * @Date: 2022/5/14 22:04
 * @Version 1.0
 */
public class Demo6Disease {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        while (true) {
            showMenu();
            System.out.print("请选择菜单：");
            int menu = scanner.nextInt();
            if (menu == 1) {
                addDiseaseAddress();
            } else if (menu == 2) {
                queryDiseasePage();
            } else if (menu == 3) {
                delete();
            } else if (menu == 4) {
                addDiseaseNum();
            } else if (menu == 5 || menu == 6) {
                System.out.println("功能开发中，敬请期待");
            } else {
                System.out.println("您输入的菜单有误！");
            }
        }
    }

    // 显示菜单
    public static void showMenu() {
        System.out.println("========欢迎进入疫情大数据管理系统=========");
        System.out.println("\t1.添加疫情城市\t2.疫情城市列表");
        System.out.println("\t3.删除疫情城市\t4.增加确诊人数");
        System.out.println("\t5.追加康复人数\t6.疑似病例确诊");
        System.out.println("======================================");
    }

    // 新增确诊
    public static void addDiseaseNum() throws Exception {
        System.out.print("请输入城市：");
        String address = scanner.next();
        System.out.print("请输入" + address + "本日新增确诊数：");
        int addNum = scanner.nextInt();
        Connection connection = DBUtils.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("update disease set disease_num = disease_num+" + addNum + " where address = '" + address + "'");
        System.out.println("操作成功！");
        DBUtils.close(statement, connection);
    }

    // 删除城市
    public static void delete() throws Exception {
        System.out.print("请输入需要删除的城市名称：");
        String address = scanner.next();
        Connection connection = DBUtils.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("delete from disease where address = '" + address + "'");
        System.out.println("删除成功！");
        DBUtils.close(statement, connection);
    }

    // 分页查询疫情信息
    public static void queryDiseasePage() throws Exception {
        int pageSize = 5;
        // 总页数总条数
        Connection connection = DBUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select count(*) from disease");
        resultSet.next();
        int totalCount = resultSet.getInt(1);
        DBUtils.close(resultSet);
        int totalPage = (int) (Math.ceil(totalCount * 1.0 / pageSize));
        System.out.println("共有" + totalCount + "条数据，一共" + totalPage + "页");
        // 默认展示第一页
        int currentPage = 1;
        while (true) {
            int offset = (currentPage - 1) * pageSize;
            resultSet = statement.executeQuery("select * from disease limit " + offset + "," + pageSize);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String address = resultSet.getString("address");
                int diseaseNum = resultSet.getInt("disease_num");
                int recoveryNum = resultSet.getInt("recovery_num");
                int maybeNum = resultSet.getInt("maybe_num");
                System.out.println("id：" + id + "，城市：" + address + "，确诊数：" + diseaseNum + "，康复数：" + recoveryNum + "，疑似数：" + maybeNum);
            }
            DBUtils.close(resultSet);
            System.out.println("1：上一页，2：下一页，输入其他退出查询页");
            String menu = scanner.next();
            if ("1".equals(menu)) {
                if (currentPage == 1) {
                    System.out.println("当前是第一页，无法查看上一页");
                } else {
                    currentPage--;
                }
            } else if ("2".equals(menu)) {
                if (currentPage == totalPage) {
                    System.out.println("当前是最后一页，无法查看下一页");
                } else {
                    currentPage++;
                }
            } else {
                break;
            }
        }
        DBUtils.close(statement, connection);
    }

    // 添加疫情城市
    public static void addDiseaseAddress() throws Exception {
        System.out.print("请输入城市名称：");
        String address = scanner.next();
        // 根据城市名称查询
        Connection connection = DBUtils.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from disease where address = '" + address + "'");
        // 只要包含数据就是存在，不需要取出数据
        if (resultSet.next()) {
            System.out.println(address + "的疫情信息已存在，请勿重复添加！");
            DBUtils.close(resultSet, statement, connection);
            return;
        }
        System.out.print("请输入确诊人数：");
        int diseaseNum = scanner.nextInt();
        System.out.print("请输入康复人数：");
        int recoveryNum = scanner.nextInt();
        System.out.print("请输入疑似确诊人数：");
        int maybeNum = scanner.nextInt();
        statement.executeUpdate("insert into disease(address, disease_num, recovery_num, maybe_num) values('" + address + "'," + diseaseNum + "," + recoveryNum + "," + maybeNum + ")");
        System.out.println("添加完毕");
    }
}
