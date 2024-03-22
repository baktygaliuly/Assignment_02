package org.example.app.pojo;

import org.example.app.constants.Constants;

public abstract class Item {
    private String id;
    private String title;
    private String author;
    private int year;
    private String genre;


    public Item(String id, String title, String author, int year, String genre) {
        setId(id);
        setTitle(title);
        setAuthor(author);
        setYear(year);
        setGenre(genre);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Invalid argument");
        }
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Invalid argument");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("Invalid argument");
        }
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < Constants.MIN_YEAR) {
            throw new IllegalArgumentException("Invalid argument");
        }
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (genre == null || genre.isBlank()) {
            throw new IllegalArgumentException("Invalid argument");
        }
        this.genre = genre;
    }

    public abstract Item clone();

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}
