package ru.mirea.lab4_1.task8;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side) {
        width = side;
        height = side;
    }

    public double getSide() {
        return width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + width +
                '}';
    }
}
