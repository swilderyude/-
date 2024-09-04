package com.yyds.unit3.demo;

public class Student {
	// 此处也称为成员变量
	String name;
	int age;
	static String grade;

	{
		System.out.println("构造代码块1被执行了");
	}
	{
		System.out.println("构造代码块2被执行了");
	}
	static {
		System.out.println("静态代码块1被执行了");
	}
	static {
		System.out.println("静态代码块2被执行了");
	}

	public Student() {
		System.out.println("无参构造执行了");
	}
	public Student(String stuName, int stuAge) {
		name = stuName;
		age = stuAge;
		System.out.println("有参构造执行了");
	}

	public Student(int age) {
		this.age = age;
	}

	public Student(String name) {
		this.name = name;
	}

	// 方法，此处也称为成员方法
	void eat(String food) {
		System.out.println(name + "吃" + food);
	}
	void study() {
		System.out.println(name + "年龄" + age + "岁，在学习java");
	}
	static void goHome() {
		// 静态方法中不能调用成员变量和成员方法，不能使用this
//		System.out.println(this.name + "回家");
		System.out.println("学生回家");
	}
}
