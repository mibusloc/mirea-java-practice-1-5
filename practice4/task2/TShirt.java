package ru.mirea.lab4.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Футболка, мужская: %s (%s), %s цвет, %.2f₽%n", size, size.getDescription(), color, price);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Футболка, женская: %s (%s), %s цвет, %.2f₽%n", size, size.getDescription(), color, price);
    }
}