import java.util.ArrayList;

public class Opera extends MusicalShow {
    int choirSize;

    public Opera(ArrayList<Actor> actor, String title, double duration, Director director, String musicAuthor,
                 String librettoText, int choirSize) {
        super(actor, title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }
}

