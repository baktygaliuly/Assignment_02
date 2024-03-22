package org.example.app.pojo;

import org.example.app.constants.Constants;

public class CD extends Item{

    private int sidNumber;

    public CD(int sidNumber, String id, String title, String author, int year, String genre) {
        super(id, title, author, year, genre);
        setSidNumber(sidNumber);;
    }

    public int getSidNumber() {
        return sidNumber;
    }

    public void setSidNumber(int sidNumber) {
        if (sidNumber < Constants.MIN_SID) {
            throw new IllegalArgumentException("Invalid argument");
        }
        this.sidNumber = sidNumber;
    }

    @Override
    public Item clone() {
        return new CD(this.getSidNumber(), this.getId(), this.getTitle(), this.getAuthor(), this.getYear(), this.getGenre());
    }
}
