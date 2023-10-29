package ru.mirea.lab2.array8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"The word", "Another word", "Not really a w0rd"};
        for (int i = 0; i < arr.length / 2; i++) {
            String tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
