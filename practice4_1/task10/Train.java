package ru.mirea.lab4_1.task10;

public class Train extends Transport {
    public Train(String name, double speed, double costPerKilometer, int passengerCapacity, double cargoCapacity) {
        super(name, speed, costPerKilometer, passengerCapacity, cargoCapacity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Train: " + name);
    }
}