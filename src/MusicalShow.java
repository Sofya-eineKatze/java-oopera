import java.util.ArrayList;

class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       ArrayList<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }
    // Распечатать текст либретто
    public void printLibretto() {
        System.out.println("Либретто спектакля '" + title + "':");
        System.out.println(librettoText);
    }
}