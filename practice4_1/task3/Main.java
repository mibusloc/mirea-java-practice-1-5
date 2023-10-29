package ru.mirea.lab4_1.task3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();

        Person person2 = new Person("Саша", 5);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
