package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book1 = bookManager.createBook("Lalka", "Bolesław Prus");
        Book book2 = bookManager.createBook("To", "Stephen King");
        Book book3 = bookManager.createBook("Life", "Keith Richards");
        Book book4 = bookManager.createBook("Lalka", "Bolesław Prus");

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
        System.out.println(book4.hashCode());
    }
}