package main.pa.Model;

import java.util.ArrayList;

public class User {
    private String name;
    ArrayList<MediaItem> rented = new ArrayList<>();

    public ArrayList<MediaItem> getRented() {
        return rented;
    }

    public void rentMediaItem(MediaItem item) {
    }

    public void giveBackMediaItem(MediaItem item) {

    }

    public boolean isMediaItemAvailable(MediaItem item) {
        return item.isAvailable();
    }

    public void reserveMediaItem(MediaItem item) {

    }

    public String previewMediaItem(MediaItem item) {
        return " ";

    }
}
