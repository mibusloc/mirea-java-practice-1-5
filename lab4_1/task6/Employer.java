package ru.mirea.lab4_1.task6;

public class Employer {
    private final String firstName;
    private final String lastName;
    private final double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income * 12;
    }
}