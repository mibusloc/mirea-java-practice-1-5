package ru.mirea.lab2.point3;

public class Tester {
    private Circle[] circles;
    private int length;

    public Tester(Circle[] circles) {
        this.circles = circles;
        this.length = circles.length;
    }

    public Circle[] getCircles() {
        return circles;
    }

    public void setCircles(Circle[] circles) {
        this.circles = circles;
        this.length = circles.length;
    }

    public int getLength() {
        return length;
    }
}
