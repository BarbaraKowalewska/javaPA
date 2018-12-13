package main.pa.Model;

import java.util.Date;

public class Movie extends MediaItem implements Watchable, Listenable {

    public Movie(String title, String author, Date releaseDate, int length) {
        super(title, author, releaseDate, length);
    }

    @Override
    public void listen() {

    }

    @Override
    public void watch() {

    }
}
