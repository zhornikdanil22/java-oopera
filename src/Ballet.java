import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private String choreographer;




    public Ballet(Director director, ArrayList<Actor> listIfActors, String title, int duration, String musicAuthor, String librettoText, String choreographer) {
        super(director, listIfActors, title, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(String choreographer) {
        this.choreographer = choreographer;
    }
}

