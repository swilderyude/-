package com.yyds.unit4.demo;
public class OuterClass1 {
    private String name;
    private InnerClass innerClass;
    // 成员内部类
    public class InnerClass {
        // 成员内部类的成员变量
        private String name;
        // 成员内部类的构造方法
        public InnerClass() {} // 无参构造方法
        public InnerClass(String name) { // 有参构造方法
            this.name = name;
        }
        // 成员内部类的成员方法
        public void test() {
            System.out.println("调用内部类的test方法");
            System.out.println("内部类的name：" + this.name);
            System.out.println("外部类的name：" + OuterClass1.this.name);
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
