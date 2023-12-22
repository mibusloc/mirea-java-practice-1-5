package ru.mirea.lab4.task3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> cartItems;
    private double totalPrice;

    public Cart() {
        cartItems = new ArrayList<>();
        totalPrice = 0;
    }

    public void addToCart(Product product) {
        cartItems.add(product);
        totalPrice += product.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Корзина пуста.");
        } else {
            System.out.println("Содержимое корзины:");
            for (int i = 0; i < cartItems.size(); i++) {
                Product product = cartItems.get(i);
                System.out.printf("%d. %s - %.2f₽%n", i + 1, product.getName(), product.getPrice());
            }
            System.out.printf("Итого: %.2f₽%n", this.totalPrice);
        }
    }

    public void clearCart() {
        cartItems.clear();
        totalPrice = 0;
    }
}