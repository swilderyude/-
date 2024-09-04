package com.yyds.unit7.demo;
public class Result<T> {
    private String msg;
    // 泛型T在使用时可以作为一个“未知的类型”来使用，在创建对象时指定泛型可以将其替换成具体的类型
    private T data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
