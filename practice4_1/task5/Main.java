package ru.mirea.lab4_1.task5;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Петров В. В.", 12345, "ИИИ", "01.01.2000", "+71234567890");

        reader.takeBook(3);
        reader.takeBook("Первая книга", "Вторая книга", "Третья книга");

        Book book1 = new Book("Книга номер 1", "Саша");
        Book book2 = new Book("Книга номер 2", "Петя");
        Book book3 = new Book("Книга без номера", "Маша");

        reader.takeBook(book1, book2, book3);

        reader.returnBook(2);
        reader.returnBook("Вторая книга", "Третья книга");

        reader.returnBook(book2, book3);
    }
}
