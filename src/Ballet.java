import java.util.ArrayList;

public class Ballet extends MusicalShow {
    String choreographer;

    public Ballet(ArrayList<Actor> actor, String title, int duration, Director director, String musicAuthor,
                  String librettoText, String choreographer) {
        super(actor, title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
