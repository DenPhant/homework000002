package com;

import java.util.Random;

public class Book {
    String author;
    int pages;
    String name;

    public Book(String author, int pages, String name) {
        this.author = author;
        this.pages = pages;
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String getName() {
        return name;
    }

    public void create(String nname, String nauthor, int npages){
        name=nname;
        author=nauthor;
        pages=npages;
    }
    public void createRandom(){
        Random random = new Random(  );
        int index = random.nextInt(20)+1;
        Names names = new Names();
        name=names.getNameRand( index );
        author=names.getAuthorRand( index );
        pages=names.getPagesRand();
    }
}
