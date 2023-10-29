package ru.mirea.lab4_1.task9;

public class FurnitureShop {
    private Furniture[] inventory;

    public FurnitureShop(int capacity) {
        inventory = new Furniture[capacity];
    }

    public void addFurniture(Furniture furniture, int index) {
        if (index >= 0 && index < inventory.length) {
            inventory[index] = furniture;
        } else {
            System.out.println("Invalid index to add furniture.");
        }
    }

    public void displayInventory() {
        System.out.println("Furniture Shop Inventory:");
        for (Furniture furniture : inventory) {
            if (furniture != null) {
                furniture.displayInfo();
            }
        }
    }
}