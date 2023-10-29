package ru.mirea.lab4_1.task9;

public abstract class Furniture {
    private final String name;
    private final double price;

    public Furniture(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
