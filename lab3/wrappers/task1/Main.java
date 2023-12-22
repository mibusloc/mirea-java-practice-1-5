package ru.mirea.lab3.wrappers.task1;

public class Main {
    public static void main(String[] args) {
        // task 1
        Double aDouble1 = Double.valueOf(12.34);
        Double aDouble2 = Double.valueOf("43.21");

        // task 2
        double aDouble3 = Double.parseDouble("13.24");

        // task 3
        Double aDouble = 135.246;
        double doubled = aDouble.doubleValue();
        float floated = aDouble.floatValue();
        int inted = aDouble.intValue();
        long longed = aDouble.longValue();
        short shorted = aDouble.shortValue();
        byte byted = aDouble.byteValue();

        // task 4
        Double aDouble4 = 123.456;
        System.out.println(aDouble4);

        // task 5
        double num = 837.128;
        String d = Double.toString(num);
    }
}