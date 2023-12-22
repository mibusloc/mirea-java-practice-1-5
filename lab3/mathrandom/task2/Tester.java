package ru.mirea.lab3.mathrandom.task2;
import java.util.Arrays;
import java.util.Comparator;

public class Tester {
    private final Circle[] circles;
    private int size;

    public Tester(int size) {
        circles = new Circle[size];
        this.size = size;
    }

    public Circle findSmallestCircle() {
        if (size == 0) {
            return null;
        }

        Circle smallest = circles[0];
        for (int i = 1; i < size; i++) {
            if (circles[i].getRadius() < smallest.getRadius()) {
                smallest = circles[i];
            }
        }
        return smallest;
    }

    public Circle findLargestCircle() {
        if (size == 0) {
            return null;
        }

        Circle largest = circles[0];
        for (int i = 1; i < size; i++) {
            if (circles[i].getRadius() > largest.getRadius()) {
                largest = circles[i];
            }
        }
        return largest;
    }

    public void sortCirclesByRadius() {
        Arrays.sort(circles, 0, size, Comparator.comparingDouble(Circle::getRadius));
    }
}