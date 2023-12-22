package ru.mirea.lab4_1.task3;

public class Person {
    private final String fullName;
    private final int age;

    public Person() {
        this.fullName = "Неизвестно";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " идёт.");
    }

    public void talk() {
        System.out.println(fullName + " говорит.");
    }
}
