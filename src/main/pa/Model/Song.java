package main.pa.Model;

import java.util.Date;

public class Song extends MediaItem implements Listenable {

    public Song(String title, String author, Date releaseDate, int length) {
        super(title, author, releaseDate, length);
    }

    @Override
    public void listen() {

    }
}
