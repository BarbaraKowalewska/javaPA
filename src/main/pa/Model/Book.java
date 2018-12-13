package main.pa.Model;

import java.util.Date;

public class Book extends MediaItem implements Readable {
    public Book(String title, String author, Date releaseDate, int length) {
        super(title, author, releaseDate, length);
    }

    @Override
    public void read() {

    }
}
