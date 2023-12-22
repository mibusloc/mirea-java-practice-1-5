package ru.mirea.lab4_1.task9;

public class Sofa extends Furniture {
    public Sofa(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Sofa: " + getName() + " - Price: $" + getPrice());
    }
}