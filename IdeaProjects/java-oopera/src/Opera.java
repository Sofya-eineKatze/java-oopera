import java.util.ArrayList;

class Opera extends MusicalShow {
    private int choirSize;

    public Opera(String title, int duration, Director director,
                 ArrayList<Actor> listOfActors, String musicAuthor, String librettoText,
                 int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    // Геттер
    public int getChoirSize() {
        return choirSize;
    }

    // Сеттер
    public void setChoirSize(int choirSize) {
        this.choirSize = choirSize;
    }
}// Файл обновлен: Tue Nov 11 19:54:36 RTZ 2025
