package test.main.pa;

import main.pa.Model.Book;
import main.pa.Model.Manager;
import main.pa.Model.MediaItem;
import main.pa.Model.User;
import main.pa.Persistence.Mediatheque;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class tests {


    @Test
    public void managerCanAddMediaItem() {
        //when

        MediaItem item = new Book("Harry Potter", "Rowling", new Date(1990, 05, 14), 100, 1);
        Mediatheque mediatheque = new Mediatheque();
        Manager manager = new Manager();

        assertTrue(manager.addMediaItem(item, mediatheque));
        assertEquals(item, mediatheque.getAllItems().get(0));
        assertEquals(mediatheque.getAllItems().size(), 1);
    }


    @Test
    public void managerCanDeleteMediaItem() {

        MediaItem item = new Book("Harry Potter", "Rowling", new Date(1990, 05, 14), 100, 1);
        Mediatheque mediatheque = new Mediatheque();
        Manager manager = new Manager();

        mediatheque.getAllItems().add(item);
        manager.removeMediaItem(item, mediatheque);

        assertFalse(mediatheque.getAllItems().contains(item));


    }

    @Test
    public void managerCanAddUser() {
        Mediatheque mediatheque = new Mediatheque();
        Manager manager = new Manager();
        User user = new User();

        assertTrue(manager.addUser(user, mediatheque));
        assertEquals(user, mediatheque.getAllUsers().get(0));
        assertEquals(1, mediatheque.getAllUsers().size());
    }

    @Test
    public void managerCanDeleteUser() {
        Mediatheque mediatheque = new Mediatheque();
        Manager manager = new Manager();
        User user = new User();

        mediatheque.getAllUsers().add(user);

        assertEquals(mediatheque.getAllUsers().size(), 1);

        manager.removeUser(user, mediatheque);

        assertFalse(mediatheque.getAllUsers().contains(user));


    }

    @Ignore
    @Test
    public void userCanRentMediaItem() {
        User user = new User();
        MediaItem item = new Book("Harry Potter", "Rowling", new Date(1990, 05, 14), 100, 1);

        user.rentMediaItem(item);


        Assert.assertTrue(user.getRented().size() == 1);

    }

    @Ignore
    @Test
    public void userCanReturnMediaItem() {

        User user = new User();
        MediaItem item = new Book("Harry Potter", "Rowling", new Date(1990, 05, 14), 100, 1);

        user.getRented().add(item);
        user.giveBackMediaItem(item);
        assertEquals(user.getRented().size(), 0);

    }

    @Test
    public void canUserCheckAvailability() {
        User user = new User();
        MediaItem item = new Book("Harry Potter", "Rowling", new Date(1990, 05, 14), 100, 1);

        assertTrue(user.isMediaItemAvailable(item));
    }

    @Ignore
    @Test
    public void canUserReserveMediaItem() {
        User user = new User();
        MediaItem item = new Book("Harry Potter", "Rowling", new Date(1990, 05, 14), 100, 1);

        assert !item.isReserved();
        user.reserveMediaItem(item);


        assertTrue(item.isReserved());


    }

    @Ignore
    @Test
    public void isSearchingForMediaItemWorking() {
        Mediatheque mediatheque = new Mediatheque();
        MediaItem item = new Book("Harry Potter", "Rowling", new Date(1990, 05, 14), 100, 1);

        mediatheque.getAllItems().add(item);


        assertEquals(mediatheque.searchMediaItem("Harry Potter"), item);
    }

    @Ignore
    @Test
    public void isPreviewWorking() {
        MediaItem item = new Book("Harry Potter", "Rowling", new Date(1990, 05, 14), 100, 1);
        User user = new User();

        String result = user.previewMediaItem(item);

        assertTrue(result.equals("Harry Potter, Rowling, 1990--5-13, 100"));


    }


    @Ignore
    @Test
    public void ManagerCanEditMediaItem() {

        Mediatheque mediatheque = new Mediatheque();
        MediaItem item = new Book("Harry Potter", "Rowling", new Date(1990, 05, 14), 100, 1);
        Manager manager = new Manager();


        mediatheque.getAllItems().add(item);
        manager.editMediaItem(item, "Little Mermaid", "Bla", new Date(1234, 12, 12), 23);


        assertEquals(item.getTitle(), "Little Mermaid");
        assertEquals(item.getAuthor(), "Rowling");
        assertEquals(item.getLength(), 23);
        assertEquals(item.getID(), 1);


    }

}
