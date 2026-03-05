import java.util.ArrayList;

public class Opera extends MusicalShow {
    private int choirSize;


    public Opera(Director director, ArrayList<Actor> listIfActors, String title, int duration, String musicAuthor, String librettoText, int choirSize) {
        super(director, listIfActors, title, duration, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}