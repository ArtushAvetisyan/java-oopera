import java.util.ArrayList;

public class MusicalShow extends Show {
    final Person musicAuthor;
    final String librettoText;

    public MusicalShow(ArrayList<Actor> actor, String title, int duration, Director director, Person musicAuthor,
                       String librettoText) {
        super(actor, title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Распечатать текст либретто (на всякий случай добавил проверки)
    public void printLibrettoText() {
        if (librettoText == null || librettoText.isBlank()) {
            System.out.println("Отсутствует текст либретто");
        } else {
            System.out.println("Текст либретто: " + librettoText);
        }
    }
}
