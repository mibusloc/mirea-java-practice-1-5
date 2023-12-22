package ru.mirea.lab4_1.task9;

public class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayInfo() {
        System.out.println("Table: " + getName() + " - Price: $" + getPrice());
    }
}