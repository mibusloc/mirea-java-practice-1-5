package ru.mirea.lab4_1.task10;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("Sedan", 100, 0.1, 5, 0.5);
        Transport airplane = new Airplane("Boeing 747", 900, 0.5, 300, 50);
        Transport train = new Train("Express", 120, 0.2, 200, 20);
        Transport ship = new Ship("Cargo Ship", 30, 0.05, 500, 2000);

        double distance = 500;
        double cargoWeight = 10;

        car.displayInfo();
        System.out.println("Time: " + car.calculateTime(distance) + " hours");
        System.out.println("Passenger Cost: $" + car.calculatePassengerCost(distance));
        System.out.println("Cargo Cost: $" + car.calculateCargoCost(distance, cargoWeight));

        airplane.displayInfo();
        System.out.println("Time: " + airplane.calculateTime(distance) + " hours");
        System.out.println("Passenger Cost: $" + airplane.calculatePassengerCost(distance));
        System.out.println("Cargo Cost: $" + airplane.calculateCargoCost(distance, cargoWeight));

        train.displayInfo();
        System.out.println("Time: " + train.calculateTime(distance) + " hours");
        System.out.println("Passenger Cost: $" + train.calculatePassengerCost(distance));
        System.out.println("Cargo Cost: $" + train.calculateCargoCost(distance, cargoWeight));

        ship.displayInfo();
        System.out.println("Time: " + ship.calculateTime(distance) + " hours");
        System.out.println("Passenger Cost: $" + ship.calculatePassengerCost(distance));
        System.out.println("Cargo Cost: $" + ship.calculateCargoCost(distance, cargoWeight));
    }
}
