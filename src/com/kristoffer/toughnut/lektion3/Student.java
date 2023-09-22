package com.kristoffer.toughnut.lektion3;

public class Student {

    public String name;
    public int age;
    public boolean isTired;

    public Student(String name, int age, boolean isTired) {
        this.name = name;
        this.age = age;
        this.isTired = isTired;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + isTired;
    }
}
