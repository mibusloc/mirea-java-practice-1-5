package ru.mirea.lab2.book7;

public class ShelfTest {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        shelf.add(new Book("Joe", "Woopa", 456));
        shelf.add(new Book("Lexa", "Boopa", 789));
        shelf.add(new Book("John", "Coopa", 123));
        System.out.println(shelf.getFirst());
        System.out.println(shelf.getLast());
    }
}
