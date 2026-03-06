import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private  Director director;
    private ArrayList<Actor> listIfActors;

    public Show(Director director, ArrayList<Actor> listIfActors, String title, int duration) {


        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listIfActors = listIfActors;
    }

    public void printAllActor() {
        for (Actor actor : listIfActors) {
            System.out.println(actor);
        }


    }

    public boolean addActor(Actor newActor) {
        for (Actor existingActor : listIfActors) {
            if (existingActor.equals(newActor)) {
                System.out.println("Актёр с таким именем, фамилией и ростом уже существует.");
                return false;
            }
        }
        listIfActors.add(newActor);
        return true;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListIfActors() {
        return listIfActors;
    }

    public void setListIfActors(ArrayList<Actor> listIfActors) {
        this.listIfActors = listIfActors;
    }
    public boolean removeActor(Actor actor) {
        return listIfActors.remove(actor);
    }
    public boolean replaceActor(Actor oldActor, Actor newActor) {
        if (listIfActors.remove(oldActor)) { // Пытаемся удалить старого актёра
            listIfActors.add(newActor); // Добавляем нового актёра, если старый был успешно удалён
            return true;
        }
        return false; // Возвращаем false, если старый актёр не был найден и не удалён
    }

}

