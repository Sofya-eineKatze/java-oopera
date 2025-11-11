import java.util.ArrayList;

class MusicalShow extends Show {
    private String musicAuthor;
    private String librettoText;

    public MusicalShow(String title, int duration, Director director,
                       ArrayList<Actor> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    // Геттеры и сеттеры
    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    // Распечатать текст либретто - исправленный доступ к title
    public void printLibretto() {
        System.out.println("Либретто спектакля '" + getTitle() + "':");
        System.out.println(librettoText);
    }
}
// Файл обновлен: Tue Nov 11 19:54:36 RTZ 2025
