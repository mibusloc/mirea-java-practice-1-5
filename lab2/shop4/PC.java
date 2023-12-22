package ru.mirea.lab2.shop4;

public class PC {
    private final String name;
    private float price;

    public PC(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PC{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
