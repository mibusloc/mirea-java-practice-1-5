package ru.mirea.lab4.task2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Юбка, женская: %s (%s), %s цвет, %.2f₽%n", size, size.getDescription(), color, price);
    }
}