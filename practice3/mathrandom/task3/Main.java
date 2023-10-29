package ru.mirea.lab3.mathrandom.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(90) + 10;
        }

        System.out.print("Array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("\nArray is a strictly increasing sequence.");
        } else {
            System.out.println("\nArray is not a strictly increasing sequence.");
        }
    }
}