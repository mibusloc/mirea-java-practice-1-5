package ru.mirea.lab4.task2;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.S, 1500, "Белый"),
                new Pants(Size.M, 3000, "Синий"),
                new Skirt(Size.XS, 2000, "Розовый"),
                new Tie(Size.L, 800, "Черный"),
                new TShirt(Size.XXS, 450, "Зеленый"),
                new Skirt(Size.XXS, 500, "Голубой")
        };

        Atelier atelier = new Atelier();

        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}