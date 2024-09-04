package com.yyds.unit5.demo;

import java.util.Scanner;

public class Demo7Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String username = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();
        try {
            login(username, password);
            // 如果方法成功运行完毕，说明两个异常都没有触发，登录成功
            System.out.println("登录成功");
        }catch (UserNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }catch (PasswordWrongException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    private static void login(String username, String password)
            throws UserNotFoundException, PasswordWrongException {
        if(!"admin".equals(username)) {
            // 用户名不存在，对于用户而言要提示用户名或密码错误，但开发者需要能知道真正的原因
            throw new UserNotFoundException("用户名或密码错误！");
        }
        if(!"123456".equals(password)) {
            // 密码错误
            throw new PasswordWrongException("用户名或密码错误！");
        }
    }

}
