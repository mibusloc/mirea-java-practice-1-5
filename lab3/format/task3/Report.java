package ru.mirea.lab3.format.task3;

public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.println("Employees report:");
        System.out.printf("%-20s %15s%n", "Full name", "Salary");

        for (Employee employee : employees) {
            System.out.printf("%-20s %15s%n", employee.getFullname(), String.format("%.2f", employee.getSalary()));
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Sylva Iesous", 1234.56);
        employees[1] = new Employee("Saylor Vaska", 2030.40);
        employees[2] = new Employee("Jaslyn Madhav", 1111.11);

        generateReport(employees);
    }
}
