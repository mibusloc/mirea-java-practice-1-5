package ru.mirea.lab2.circle6;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getLength() {
        return 2 * Math.PI * this.radius;
    }

    public boolean compare(Circle other) {
        return this.x == other.getX() && this.y == other.getY() && this.radius == other.getRadius();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                '}';
    }
}
