package ru.mirea.lab2.author1;

public class AuthorTest {
    public static void main(String[] args) {
        Author author = new Author("Joe", "dough@email.com", 'm');
        System.out.println(author);
        author.setEmail("joe@email.com");
        System.out.println(author.getName() + " " + author.getEmail() + " " + author.getGender());
    }
}
