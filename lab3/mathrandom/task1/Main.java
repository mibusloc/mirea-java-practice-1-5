package ru.mirea.lab3.mathrandom.task1;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] arr = new double[10];

        System.out.println("--- Method 1: using Random ---");
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble();
        }
        printBeforeAfterSort(arr);

        System.out.println("--- Method 2: using Math.random ---");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        printBeforeAfterSort(arr);
    }

    private static void printBeforeAfterSort(double[] arr) {
        System.out.println("Unsorted:");
        for (double v : arr) {
            System.out.println(v);
        }

        Arrays.sort(arr);

        System.out.println("Sorted:");
        for (double v : arr) {
            System.out.println(v);
        }
    }
}
