package ru.mirea.lab4.task3;

import java.util.ArrayList;

public class Catalog {
    private final String name;
    private final ArrayList<Product> products;

    public Catalog(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}