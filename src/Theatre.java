import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {

        Actor leo = new Actor("Леонардо", "ДиКаприо", 183, Gender.MALE);
        Actor brad = new Actor("Брэд", "Питт", 180, Gender.MALE);
        Actor angelina = new Actor("Анджелина", "Джоли", 169, Gender.FEMALE);

        Director nolan = new Director("Кристофер", "Нолан", 12, Gender.MALE);
        Director tarantino = new Director("Квентин", "Тарантино", 9, Gender.MALE);

        String musicAuthor = "Ханс Циммер";
        String choreographer = "Юрий Григорович";

        // Создаём спектакли (с пустыми списками)
        Show show = new Show(new ArrayList<>(), "Обычный", 2.5, nolan);

        Opera opera = new Opera(new ArrayList<>(), "Опера", 3, nolan,
                musicAuthor, "текст либретто", 5);

        Ballet ballet = new Ballet(new ArrayList<>(), "Балет", 1.15, tarantino, musicAuthor,
                "текст либретто", choreographer);

        // Распределяем актёров по спектаклям
        show.addNewActor(leo);
        show.addNewActor(angelina);
        show.addNewActor(brad);
        opera.addNewActor(brad);
        ballet.addNewActor(angelina);

        // Вывод на экран список актёров спектаклей
        System.out.println("Список актёров в спектакле с названием " + show.title + ":");
        show.printAllActorsInfo();
        System.out.println("Список актёров в спектакле с названием " + opera.title + ":");
        opera.printAllActorsInfo();
        System.out.println("Список актёров в спектакле с названием " + ballet.title + ":");
        ballet.printAllActorsInfo();


        // Замена актёра в спектакле (Я хотел написать get(0), но Idea предложил getFirst)
        ballet.replaceActor(opera.listOfActors.getFirst(), "Джоли");
        System.out.println("Список актёров в спектакле с названием " + ballet.title + ":");

        // Замена актёра на несуществующий (я так понимаю, нужно ввести фамилию актёра, который не существует)
        opera.replaceActor(leo, "Йоханссон");

        // Вывод на экран текста либретто
        System.out.println("Текст либретто оперного спектакля:");
        opera.printLibrettoText();
        System.out.println("Текст либретто балетного спектакля:");
        ballet.printLibrettoText();

    }
}