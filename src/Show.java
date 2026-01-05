import java.util.ArrayList;

public class Show {
    final ArrayList<Actor> listOfActors;
    final String title;
    final int duration;
    final Director director;

    public Show(ArrayList<Actor> actor, String title, int duration, Director director) {
        this.listOfActors = new ArrayList<>(actor);
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    // Вывод информации для всех актёров по отдельности
    public void printAllActorsInfo() {
        System.out.println("Список всех актёров:");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    // Добавляем нового актёра в спектакль
    public void addNewActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Данный актёр уже добавлен в список!");
        } else if (actor == null) {
            System.out.println("Добавление актёра невозможна, так как отсутствует информация об актёре.");
        } else {
            listOfActors.add(actor);
            System.out.println(actor.name + " " + actor.surname + " добавлен в список. " +
                    "Его рост составляет - " + actor.height);
        }
    }

    // Замена актёра в списке (метод получает нового актёра и ищёт старого актёра по фамилии)
    public void replaceActor(Actor actor, String replaceActorSurname) {
        Actor actorForCycle;
        boolean isValid = false;
        int count = 0;

        if (actor == null) {
            System.out.println("Ошибка, отсутствует информация об актёре!");
            return;
        }

        for (Actor a : listOfActors) {
            if (a.surname.equals(replaceActorSurname)) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("Ошибка! Актёр с такой фамилией уже в списке.");
            return;
        }

        for (int i = 0; i < listOfActors.size(); i++) {
            actorForCycle = listOfActors.get(i);
            if (actorForCycle.surname.equals(replaceActorSurname)) {
                listOfActors.set(i, actor);
                isValid = true;
                break;
            }
        }
        if (!isValid) {
            System.out.println("В списке отсутствует актёр с фамилией " + replaceActorSurname);
        }
    }
}