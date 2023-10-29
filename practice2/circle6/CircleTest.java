package ru.mirea.lab2.circle6;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(1, 2, 3);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getLength());

        circle.setX(12);
        circle.setY(21);
        circle.setRadius(33);
        System.out.println(circle);

        System.out.println(circle.compare(new Circle(1, 2, 3)));
        System.out.println(circle.compare(new Circle(12, 21, 33)));

        System.out.println(circle.getX() + " " + circle.getY() + " " + circle.getRadius());
    }
}
