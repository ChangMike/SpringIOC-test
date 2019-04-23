package com.test.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        // my.xml放在maven项目的resources目录下
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("my.xml");
        Person person = context.getBean(Person.class);
        System.out.println(person.getCar().getColor());
    }
}
class Person {
    private Car car;
    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return car;
    }
}

class Car {
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}