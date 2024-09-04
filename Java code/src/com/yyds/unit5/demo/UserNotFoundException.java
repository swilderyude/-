package com.yyds.unit5.demo;
public class UserNotFoundException extends Exception{
    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super(message);
    }
}
