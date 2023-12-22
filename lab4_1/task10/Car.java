package ru.mirea.lab4_1.task10;

public class Car extends Transport {
    public Car(String name, double speed, double costPerKilometer, int passengerCapacity, double cargoCapacity) {
        super(name, speed, costPerKilometer, passengerCapacity, cargoCapacity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + name);
    }
}