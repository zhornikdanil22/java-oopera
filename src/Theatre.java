import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Danil", "Zhornik", Gender.FEMALE,170);
        Actor actor2 = new Actor("Dmitry", "Stepanenko" ,Gender.FEMALE, 178);
        Actor actor3 = new Actor("Vlada", "Zhornik", Gender.FEMALE,183);

        Director director1 = new Director("Elena", "Botova", Gender.FEMALE, 10);
        Director director2 = new Director("Alex", "Efremov", Gender.MALE, 25);

        Person person1 = new Person("Наталья", "Иванова", Gender.MALE);
        Person person2 = new Person("Иван", "Добрынин", Gender.FEMALE);


        Show showClassic = new Show(director1, new ArrayList<>(), "Волки и овцы", 50);
        Ballet ballet = new Ballet(director2, new ArrayList<>(), "Лебединое озеро", 45, person2,
                "Незнаю", person1);
        Opera opera = new Opera(director2, new ArrayList<>(), "Кармен", 55, person2,
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

        boolean actorReplaced = showClassic.replaceActor(actor3, actor2);
        if (actorReplaced) {
            System.out.println("Актёр " + actor2 + " заменён на актёра " + actor1 + " в спектакле " +
                    showClassic.getTitle());
        } else {
            System.out.println("Актёр " + actor2 + " не найден в спектакле " + showClassic.getTitle() +
                    ", замена не выполнена.");
        }


        System.out.println("Обновлённый список актёров обычного спектакля:");
        showClassic.printAllActor();
        System.out.println("Обновлённый список актёров балета:");
        ballet.printAllActor();

        boolean actorRemoved = opera.removeActor(new Actor("Милана", "Данилова",  Gender.FEMALE,29));
        if (actorRemoved) {
            System.out.println("Актёр удалён из спектакля.");
        } else {
            System.out.println("Актёр не найден в спектакле.");
        }
          opera.printLibrettoText();
          ballet.printLibrettoText();



    }

}
