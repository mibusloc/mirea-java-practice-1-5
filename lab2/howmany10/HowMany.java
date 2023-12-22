package ru.mirea.lab2.howmany10;

import java.util.Arrays;
import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        s += in.nextLine();
        in.close();
        String[] words = s.split("\\W+");
        System.out.println(words.length);
    }
}
