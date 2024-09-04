package com.yyds.unit13.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    // 注解的语法：类型 属性名() default 默认值; 其中default默认值可以省略
    int id();
    String msg() default "HelloWorld";
}
