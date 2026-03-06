import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Person choreographer;




    public Ballet(Director director, ArrayList<Actor> listIfActors, String title, int duration, Person musicAuthor, String librettoText, Person choreographer) {
        super(director, listIfActors, title, duration, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }
}

