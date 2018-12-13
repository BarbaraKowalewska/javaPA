package main.pa.Model;

import java.util.Date;

public abstract class MediaItem {
    private String title;
    private String author;
    private java.util.Date releaseDate;
    private boolean isAvailable = true;
    private boolean isReserved = false;
    private int length;

    public MediaItem(String title, String author, Date releaseDate, int length) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.length = length;
    }


    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getLength() {
        return length;
    }
}


