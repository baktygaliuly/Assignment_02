package org.example.app.pojo;

import org.example.app.constants.Constants;

public class Magazine extends Item{
    private int issn;

    public Magazine(int issn, String id, String title, String author, int year, String genre) {
        super(id, title, author, year, genre);
        setIssn(issn);
    }

    public int getIssn() {
        return issn;
    }

    public void setIssn(int issn) {
        if (issn < Constants.MIN_ISSN) {
            throw new IllegalArgumentException("Invalid argument");
        }
        this.issn = issn;
    }

    @Override
    public Item clone() {
        return new Magazine(this.getIssn(), this.getId(), this.getTitle(), this.getAuthor(), this.getYear(), this.getGenre());
    }
}
