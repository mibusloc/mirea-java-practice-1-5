package ru.mirea.lab3.format.task1;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Converter {
    private double rubToUSDRate;
    private final NumberFormat formatter;

    public Converter(double rubToUSDRate) {
        this.rubToUSDRate = rubToUSDRate;
        formatter = NumberFormat.getCurrencyInstance(Locale.US);
    }

    public double convertRubToUSD(double rub) {
        return rub / rubToUSDRate;
    }

    public double convertUSDToRub(double usd) {
        return usd * rubToUSDRate;
    }

    public double getRubToUSDRate() {
        return rubToUSDRate;
    }

    public void setRubToUSDRate(double rubToUSDRate) {
        this.rubToUSDRate = rubToUSDRate;
    }

    public String formatCurrency(double amount) {
        return formatter.format(amount);
    }

    public String formatRubles(double amountInRubles) {
        formatter.setCurrency(Currency.getInstance(new Locale.Builder().setLanguage("ru").setRegion("RU").build()));
        return formatCurrency(amountInRubles);
    }

    public String formatUSD(double amountInDollars) {
        formatter.setCurrency(Currency.getInstance("USD"));
        return formatCurrency(amountInDollars);
    }

    public static void main(String[] args) {
        Converter converter = new Converter(95.2);

        double inRub = 4321;
        double inUSD = converter.convertRubToUSD(inRub);
        System.out.println("Amount in RUB: " + converter.formatRubles(inRub));
        System.out.println("Amount in USD: " + converter.formatUSD(inUSD));

        double inUSD2 = 123;
        double inRub2 = converter.convertUSDToRub(inUSD2);
        System.out.println("Amount in USD: " + converter.formatUSD(inUSD2));
        System.out.println("Amount in RUB: " + converter.formatRubles(inRub2));
    }
}