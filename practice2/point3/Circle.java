package ru.mirea.lab2.point3;

public class Circle {
    Point point;
    private double radius;

    public Circle() {
        point = new Point();
        this.radius = 0;
    }

    public Circle(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
