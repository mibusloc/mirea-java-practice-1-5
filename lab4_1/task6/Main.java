package ru.mirea.lab4_1.task6;

public class Main {
    public static void main(String[] args) {
        Employer emp1 = new Employer("John", "Doe", 50000);
        Manager manager1 = new Manager("Doe", "Joe", 60000, 5000);

        Employer[] employees = {emp1, manager1};

        for (Employer employee : employees) {
            System.out.println(employee.getClass().getSimpleName() + ": " + employee.getIncome());
        }
    }
}
