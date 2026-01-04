import java.util.ArrayList;

public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(ArrayList<Actor> actor, String title, double duration, Director director, String musicAuthor,
                       String librettoText) {
        super(actor, title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Распечатать текст либретто (на всякий случай добавил проверки)
    public void printLibrettoText() {
        if (librettoText == null || librettoText.isEmpty()) {
            System.out.println("Отсутствует текст либретто");
        } else {
            System.out.println("Текст либретто: " + librettoText);
        }
    }
}
