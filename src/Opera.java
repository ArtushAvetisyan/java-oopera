import java.util.ArrayList;

public class Opera extends MusicalShow {
    final int choirSize;

    public Opera(ArrayList<Actor> actor, String title, int duration, Director director, Person musicAuthor,
                 String librettoText, int choirSize) {
        super(actor, title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}

