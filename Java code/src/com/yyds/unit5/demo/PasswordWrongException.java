package com.yyds.unit5.demo;
public class PasswordWrongException extends RuntimeException{
    public PasswordWrongException() {
    }

    public PasswordWrongException(String message) {
        super(message);
    }
}
