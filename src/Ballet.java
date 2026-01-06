import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(ArrayList<Actor> actor, String title, int duration, Director director, Person musicAuthor,
                  String librettoText, Person choreographer) {
        super(actor, title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
