package ru.mirea.lab3.format.task2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the price in USD: $");
        double inUSD = in.nextDouble();

        System.out.print("Select payment currency (USD, EUR, RUB): ");
        String currency = in.next().toUpperCase();

        DecimalFormat decimalFormat;
        double rate = switch (currency) {
            case "EUR" -> {
                decimalFormat = new DecimalFormat("€#.##");
                yield 0.94;
            }
            case "RUB" -> {
                decimalFormat = new DecimalFormat("₽#.##");
                yield 95.2;
            }
            default -> {
                decimalFormat = new DecimalFormat("$#.##");
                yield 1.0;
            }
        };

        double price = inUSD * rate;

        System.out.printf("Price in the selected currency: %s %s%n", currency, decimalFormat.format(price));
    }
}