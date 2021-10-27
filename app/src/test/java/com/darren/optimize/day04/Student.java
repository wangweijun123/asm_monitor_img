package com.darren.optimize.day04;

public class Student implements Element{
    public int age;

    public Student(int age) {
        this.age = age;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitor(this);
    }
}
