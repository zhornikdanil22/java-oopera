import java.util.ArrayList;

public class MusicalShow extends Show {
   private Person musicAuthor;
   private String librettoText;

    public MusicalShow(Director director, ArrayList<Actor> listIfActors, String title, int duration, Person musicAuthor, String librettoText) {
        super(director, listIfActors, title, duration);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }


    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(Person musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }
    public void printLibrettoText() {
        System.out.println("Текст либретто: " + librettoText);
    }
}

