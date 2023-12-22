package ru.mirea.lab4.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Штаны, мужские: %s (%s), %s цвет, %.2f₽%n", size, size.getDescription(), color, price);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Штаны, женские: %s (%s), %s цвет, %.2f₽%n", size, size.getDescription(), color, price);
    }
}