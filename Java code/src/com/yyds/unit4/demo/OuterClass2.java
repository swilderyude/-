package com.yyds.unit4.demo;
public class OuterClass2 {
    private String name;
    private InnerClass innerClass;
    // 静态内部类
    public static class InnerClass {
        private String name;
        public InnerClass() {}
        public InnerClass(String name) { // 有参构造方法
            this.name = name;
        }
        public void test() {
            System.out.println("调用内部类的test方法");
            System.out.println("内部类的name：" + this.name);
            System.out.println("静态内部类无法调用外部类的非静态属性和方法");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public void test() {
        System.out.println("调用外部类的test方法");
        System.out.println("外部类的name：" + this.name);
        System.out.println("内部类的name：" + this.innerClass.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }
}
