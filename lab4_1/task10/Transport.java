package ru.mirea.lab4_1.task10;

public abstract class Transport {
    protected String name;
    protected double speed;
    protected double costPerKilometer;
    protected int passengerCapacity;
    protected double cargoCapacity;

    public Transport(String name, double speed, double costPerKilometer, int passengerCapacity, double cargoCapacity) {
        this.name = name;
        this.speed = speed;
        this.costPerKilometer = costPerKilometer;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
    }

    public double calculateTime(double distance) {
        return distance / speed;
    }

    public double calculatePassengerCost(double distance) {
        return distance * costPerKilometer / passengerCapacity;
    }

    public double calculateCargoCost(double distance, double cargoWeight) {
        return distance * costPerKilometer * (cargoWeight / cargoCapacity);
    }

    public abstract void displayInfo();
}