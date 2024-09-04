package com.yyds.unit13.demo;

public class Car {
    private Integer id;
    private String type;
    public Double price;

    public Car() {
    }

    private Car(String type) {
        this.type = type;
    }

    private void run() {
        System.out.println("车在路上跑");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
