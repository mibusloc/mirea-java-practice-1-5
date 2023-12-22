package ru.mirea.lab4_1.task5;

public class Reader {
    private final String fullName;
    private final int libraryCardNumber;
    private final String faculty;
    private final String birthDate;
    private final String phoneNumber;

    public Reader(String fullName, int libraryCardNumber, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    private void printBookNames(String[] bookNames) {
        for (int i = 0; i < bookNames.length; i++) {
            System.out.print(bookNames[i]);
            if (i < bookNames.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    public void takeBook(String... bookNames) {
        System.out.print(fullName + " взял книги: ");
        printBookNames(bookNames);
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle() + ", автор: " + books[i].getAuthor());
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги.");
    }

    public void returnBook(String... bookNames) {
        System.out.print(fullName + " вернул книги: ");
        printBookNames(bookNames);
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle() + ", автор: " + books[i].getAuthor());
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}