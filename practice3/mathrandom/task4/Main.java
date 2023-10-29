package ru.mirea.lab3.mathrandom.task4;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        do {
            System.out.print("Choose an array size (>0): ");
            while (!in.hasNextInt()) {
                System.out.print("Wrong size, try again: ");
                in.next();
            }
            n = in.nextInt();
        } while (n <= 0);

        int[] arr = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n + 1);
        }

        System.out.println("Initial array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("\nNo even numbers in the array.");
            return;
        }

        int[] arrEven = new int[count];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                arrEven[j] = arr[i];
                j++;
            }
        }

        System.out.println("\nOnly even numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(arrEven[i] + " ");
        }
    }
}