package ru.mirea.lab4.task4;

public class Processor {
    private final String model;
    private final double speedInGHz;

    public Processor(String model, double speedInGHz) {
        this.model = model;
        this.speedInGHz = speedInGHz;
    }

    public String getModel() {
        return model;
    }

    public double getSpeedInGHz() {
        return speedInGHz;
    }
}
