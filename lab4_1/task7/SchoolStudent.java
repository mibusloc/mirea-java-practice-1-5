package ru.mirea.lab4_1.task7;

public class SchoolStudent extends Student {
    public SchoolStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(name + " is a school student");
    }
}