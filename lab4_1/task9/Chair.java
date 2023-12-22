package ru.mirea.lab4_1.task9;

public class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Chair: " + getName() + " - Price: $" + getPrice());
    }
}