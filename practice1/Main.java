package ru.mirea.lab1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        task1();
        System.out.println("Task 2:");
        task2();
        System.out.println("Task 3:");
        task3(args);
        System.out.println("Task 4:");
        task4();
        System.out.println("Task 5:");
        task5();
    }

    private static void task1() {
        int[] arr = new int[] {8, 6, 1, 5, 2, 9, 3, 4, 0, 7};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum: " + sum + ", Avr: " + (double)sum / arr.length);
    }

    private static void task2() {
        int min = 999999, max = -999999, sum = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int cur = in.nextInt();
            sum += cur;
            if (cur > max) {
                max = cur;
            }
            if (cur < min) {
                min = cur;
            }
        }
        System.out.println("Sum: " + sum + ", Min: " + min + ", Max: " + max);
    }

    private static void task3(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    private static void task4() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%.3f ", 1./i);
        }
        System.out.println();
    }

    private static void task5() {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int result = 1, num = in.nextInt();
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}
