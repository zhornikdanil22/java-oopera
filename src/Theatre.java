import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Danil", "Zhornik", 24, Gender.MALE);
        Actor actor2 = new Actor("Dmitry", "Stepanenko", 24,Gender.MALE);
        Actor actor3 = new Actor("Vlada", "Zhornik", 20, Gender.FEMALE);

        Director director1 = new Director("Elena", "Botova", 35, Gender.FEMALE, 10);
        Director director2 = new Director("Alex", "Efremov", 28, Gender.MALE, 25);

        Show showClassic = new Show(director1, new ArrayList<>(), "Волки и овцы", 50);
        Ballet ballet = new Ballet(director2, new ArrayList<>(), "Лебединое озеро", 45,
                "Евгений Ложников", "Незнаю", "Максим Маливанов");
        Opera opera = new Opera(director2, new ArrayList<>(), "Кармен", 55, "Александр Шмойлов",
                "Незнаю",10);
        showClassic.addActor(actor3);
        showClassic.addActor(actor1);

        opera.addActor(actor2);
        opera.addActor(actor1);

        ballet.addActor(actor2);

        System.out.println("Актёры обычного спектакля:");
        showClassic.printAllActor();

        System.out.println("Актёры оперного спектакля:");
        opera.printAllActor();

        System.out.println("Актёры балета:");
        ballet.printAllActor();

        ArrayList<Actor> showActors = showClassic.getListIfActors();
        ArrayList<Actor> balletActors = ballet.getListIfActors();
        if (!showActors.isEmpty() && !balletActors.isEmpty()) {

            Actor removedActor = showActors.remove(0);

            balletActors.add(0, removedActor);

            showClassic.setListIfActors(showActors);
            ballet.setListIfActors(balletActors);
        }
        System.out.println("Обновлённый список актёров обычного спектакля:");
        showClassic.printAllActor();

        System.out.println("Обновлённый список актёров балета:");
        ballet.printAllActor();

        boolean actorRemoved = opera.removeActor(new Actor("Милана", "Данилова", 29, Gender.FEMALE));
        if (actorRemoved) {
            System.out.println("Актёр удалён из спектакля.");
        } else {
            System.out.println("Актёр не найден в спектакле.");
        }
          opera.printLibrettoText();
          ballet.printLibrettoText();



    }

}
