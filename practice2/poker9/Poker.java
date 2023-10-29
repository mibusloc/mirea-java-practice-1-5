package ru.mirea.lab2.poker9;

import java.util.ArrayList;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        ArrayList<String> deck = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            String suit = switch (i) {
                case 0 -> "clubs";
                case 1 -> "diamonds";
                case 2 -> "hearts";
                case 3 -> "spades";
                default -> "";
            };
            for (int j = 1; j <= 13; j++) {
                String card = switch (j) {
                    case 1 -> "Ace of";
                    case 11 -> "Jack of";
                    case 12 -> "Queen of";
                    case 13 -> "King of";
                    default -> Integer.toString(j) + " of";
                };
                deck.add(card + " " + suit);
            }
        }

        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("Player " + (i + 1) + ": ");
                for (int j = 0; j < 5; j++) {
                    int el = (int) (Math.random() * deck.size());
                    System.out.print(deck.get(el) + ", ");
                    deck.remove(el);
                }
                System.out.println("\n");
            }
        }

    }
}
