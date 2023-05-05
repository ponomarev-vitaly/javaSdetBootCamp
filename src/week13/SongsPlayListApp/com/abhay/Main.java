package week13.SongsPlayListApp.com.abhay;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    // Create main method.
    public static void main(String[] args) {
        Album album = new Album("Album1", "AC/DC");

        album.addSong("TNT", 4.5);
        album.addSong("Highway to hell", 3.5);
        album.addSong("ThunderStruck", 5.0);
        albums.add(album);

        album = new Album("Album2", "Eminem");

        album.addSong("Rap god", 4.5);
        album.addSong("Not afraid", 3.5);
        album.addSong("Lose yourself", 4.5);
        albums.add(album);

        LinkedList<Song> playlist_1 = new LinkedList<>();

        albums.get(0).addToPlayList("TNT", playlist_1);
        albums.get(0).addToPlayList("Highway to hellT", playlist_1);
        albums.get(0).addToPlayList("Rap god", playlist_1);
        albums.get(0).addToPlayList("Lose yourself", playlist_1);

        play(playlist_1);
    }

    private static void play(LinkedList<Song> playList){

    }
}
