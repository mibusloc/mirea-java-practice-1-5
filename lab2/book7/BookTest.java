package ru.mirea.lab2.book7;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("John", "WoobleBooble", 1984);
        System.out.println(book);
        System.out.println(book.getName() + " " + book.getAuthor() + " " + book.getYear());
        book.setName("Funny name");
        book.setAuthor("Funny author");
        book.setYear(1);
        System.out.println(book);
    }
}
