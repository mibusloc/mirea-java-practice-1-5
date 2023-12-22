package ru.mirea.lab4_1.task9;

public class Main {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop(3);

        Chair chair = new Chair("Cool Chair", 3000);
        Table table = new Table("Cool Table", 10000);
        Sofa sofa = new Sofa("Cool Sofa", 20000);

        shop.addFurniture(chair, 0);
        shop.addFurniture(table, 1);
        shop.addFurniture(sofa, 2);

        shop.displayInventory();
    }
}
