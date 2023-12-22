package ru.mirea.lab4_1.task1;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape square = new Square(3.0);

        Shape[] shapes = {circle, rectangle, square};

        for (Shape shape : shapes) {
            System.out.printf("%s: area: %s, perimeter: %s%n", shape, shape.getArea(), shape.getPerimeter());
        }
    }
}
