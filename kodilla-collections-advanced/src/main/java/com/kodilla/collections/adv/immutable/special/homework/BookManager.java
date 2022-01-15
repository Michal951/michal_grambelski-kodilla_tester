package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> book = new ArrayList<>();

    public static Book createBook(String title, String author) {
        return new Book(title, author);
    }
}