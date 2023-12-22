package ru.mirea.lab4.task4;

public class Monitor {
    private final String model;
    private final double sizeInInches;

    public Monitor(String model, int sizeInInches) {
        this.model = model;
        this.sizeInInches = sizeInInches;
    }

    public String getModel() {
        return model;
    }

    public double getSizeInInches() {
        return sizeInInches;
    }
}
