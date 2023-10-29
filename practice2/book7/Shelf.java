package ru.mirea.lab2.book7;

import java.util.ArrayList;
import java.util.Comparator;

public class Shelf {
    private ArrayList<Book> books;

    public Shelf() {
        books = new ArrayList<Book>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void sort() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }

    public Book getFirst() {
        sort();
        return books.get(0);
    }

    public Book getLast() {
        sort();
        return books.get(books.size() - 1);
    }
}
