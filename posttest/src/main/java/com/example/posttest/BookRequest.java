package com.example.posttest;

public class BookRequest {
    private String book;
    private int id;

    public BookRequest(String book){
        this.book = book;
    }

    public String getBook(){return book;}

    public void setBook(String book){
        this.book = book;
    }
}
