package ru.mirea.lab4_1.task7;

public class CollegeStudent extends Student {
    public CollegeStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(name + " is a college student");
    }
}