package com.yyds.unit7.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo2ArrayList {
    public static void main(String[] args) {
        // 可以手动指定底层数组的容量
        List list = new ArrayList(3);
        list.add("张三");
        list.add("李四");
        list.add("王五");
        System.out.println(list);
        // 添加的元素超出了3个，依然可以添加，因为底层发生了扩容
        list.add("赵六");
        list.add("田七");
        list.add("刘八");
        System.out.println(list);
        // 向索引为2的位置插入数据，索引2之后的所有元素都要向后移动一位，因此性能偏低
        list.add(2, "九妹");
        System.out.println(list);
        // 直接修改索引为2位置的元素，不涉及元素的移动，因此性能很高
        list.set(2, "冯十");
        System.out.println(list);
        // 删除索引为3位置的元素，索引3之后所有的元素都要向前移动以为，因此性能偏低
        list.remove(3);
        System.out.println(list);
        // 获取索引为2位置的元素，不涉及元素的移动，因此性能很高
        Object o = list.get(2);
        System.out.println(o);
    }
}
