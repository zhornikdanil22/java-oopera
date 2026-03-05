public class Actor extends Person {


    public Actor(String name, String surname, int height, Gender gender) {
        super(name, surname, height, gender);
    }

    @Override
    public String toString() {
        return "Актёр: " + getName() +
                " " + getSurname() +
                ", (Возраст: " + getHeight() +
                ", Пол: " + getGender().toString() +
                ")";
    }
}
