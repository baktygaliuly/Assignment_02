package org.example.app.pojo;

import org.example.app.constants.Constants;

public class Book extends Item{
    private int isbn;
    public Book(int isbn, String id, String title, String author, int year, String genre) {
        super(id, title, author, year, genre);
        setIsbn(isbn);
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        if (isbn < Constants.MIN_ISBN) {
            throw new IllegalArgumentException("Invalid argument");
        }
        this.isbn = isbn;
    }

    @Override
    public Item clone() {
        return new Book(this.getIsbn(), this.getId(), this.getTitle(), this.getAuthor(), this.getYear(), this.getGenre());
    }
}
