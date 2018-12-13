package main.pa.Persistence;

import main.pa.Model.MediaItem;
import main.pa.Model.User;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;

public class Mediatheque {

    private ArrayList<MediaItem> allItems = new ArrayList<>();
    private ArrayList<User> allUsers = new ArrayList<>();

    public ArrayList<MediaItem> getAllItems() {
        return allItems;

    }

    public ArrayList<User> getAllUsers() {
        return allUsers;
    }

    public MediaItem searchMediaItem(String title) {
        return null;

    }


}
