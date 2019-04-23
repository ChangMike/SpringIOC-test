package com.test.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        // my.xml放在maven项目的resources目录下
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/my.xml");
        King hanWudi = context.getBean(King.class);
        hanWudi.order();
        context.close();
    }
}