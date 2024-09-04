package com.yyds.unit4.demo;
// 被final修饰的类不能被继承
public final class Teacher extends People {
    // final修饰的变量叫做常量，只能赋值一次
    private final String school = "北京大学";
    public void teach() {
        // 通过继承，teacher也拥有age和name，只不过由于它们被private修饰，只能通过get方法访问
        System.out.println(getAge() + "岁的" + getName() + "正在教书");
    }

    @Override
    // 加上final关键字后，该方法不能被子类重写
    public final void eat() {
        // 调用父类的方法，必须要使用super关键字
        super.eat();
        System.out.println(getAge() + "岁的" + getName() + "老师正在食堂吃饭");
    }
}
