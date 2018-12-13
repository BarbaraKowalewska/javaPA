package main.pa.Model;

import main.pa.Persistence.Mediatheque;

import java.util.Date;

public class Manager extends User {



    public boolean addMediaItem(MediaItem item, Mediatheque mediatheque) {
        return mediatheque.getAllItems().add(item);
    }

    public void removeMediaItem(MediaItem item, Mediatheque mediatheque) {
        if (mediatheque.getAllItems().contains(item)) {
            mediatheque.getAllItems().remove(item);
        }
    }

    public boolean addUser(User user, Mediatheque mediatheque) {
        return mediatheque.getAllUsers().add(user);
    }

    public void removeUser(User user, Mediatheque mediatheque) {
        if (mediatheque.getAllUsers().contains(user)){
            mediatheque.getAllUsers().remove(user);

        }

    }

    public void editMediaItem(MediaItem item, String newTitle, String newAuthor, Date newDate, int newLength ) {

    }


}
