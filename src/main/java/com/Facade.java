package com;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Facade {

    private List<Book> books;

    public Facade() {
        books = new ArrayList<>();
        Book book= new Book( "a",1 ,"a");
        for (int i=0; i<11;i++){
            book.createRandom();
            books.add(new Book(book.getAuthor(), book.getPages(), book.getName()));
        }

    }

    public List<Book> getBooks() {
        return books;
    }

    public String getMessage() {
        return "hello";
    }
}
