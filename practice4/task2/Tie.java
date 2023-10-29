package ru.mirea.lab4.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Галстук, мужской: %s (%s), %s цвет, %.2f₽%n", size, size.getDescription(), color, price);
    }
}