package com.yyds.unit8.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo4CollectionLambda {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("西游记", 120.0));
        list.add(new Product("牙刷", 3.5));
        list.add(new Product("笔记本电脑", 4999.0));
        list.add(new Product("安卓手机", 2999.0));
        list.add(new Product("苹果手机", 6999.0));
        System.out.println("排序前：");
        // lambda语法遍历集合，这里还可以再简化吗？
        list.forEach(e-> System.out.println(e));
        // 删除价格小于100的商品
        list.removeIf(e->e.price<100);
        /*
        // 匿名内部类方式排序
        list.sort(new Comparator<Product>() {
            @Override
            public int compare(Product a, Product b) {
                return (int)(a.price - b.price);
            }
        });*/
        // Lambda表达式排序
        list.sort((a, b) -> (int)(a.price - b.price));
        System.out.println("排序后：");
        list.forEach(System.out::println);

    }
    private static class Product {
        private String name;
        private Double price;

        public Product(String name, Double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
