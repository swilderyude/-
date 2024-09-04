package com.yyds.unit7.demo;

import java.util.Arrays;
import java.util.List;

public class Demo13Generic {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "PHP", "Python");
        method1(list1);
        // 泛型不符合要求，list1不能使用method2
        // method2(list1);
        List<Integer> list2 = Arrays.asList(10086, 10000, 10010, 12315);
        method2(list2);
    }
    // 不确定将要处理的List泛型，使用?通配符，可以传入任意泛型的List
    private static void method1(List<?> list) {
        // ?通配符由于不知道具体的数据类型，因此不能添加元素
        // list.add("123");
        // 在获取数据时，?通配符会被视为Object
        System.out.println("无限定通配符");
        for (Object o : list) {
            System.out.println(o);
        }
    }
    // 指定上限通配符，该方法只能传泛型是Number或者Number子类的List
    private static void method2(List<? extends Number> list) {
        // 尽管指定了泛型上限，依然不可以向集合中添加元素
        // Number a = 123;
        // list.add(a);
        // 由于确定了上限，利用多态的性质，Number都可以接收
        System.out.println("上限通配符");
        for (Number number : list) {
            System.out.println(number);
        }
    }

}
