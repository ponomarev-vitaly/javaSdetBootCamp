package week13.SongsPlayListApp.com.abhay;

public class Song {
    String title;
    double duration;
// Create a constructor.
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    //
    public Song(){

    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
