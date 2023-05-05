package week13.SongsPlayListApp.com.abhay;

import java.util.*;

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
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

    }

    private static void printMenu(){
        System.out.println("Available options\n press: ");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay current song\n" +
                "4 - list of all songs\n" +
                "5 - print all available options\n" +
                "6 - delete current song");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("<------------------------------>");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("<------------------------------>");
    }
}
