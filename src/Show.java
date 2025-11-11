import java.util.ArrayList;

class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    // Распечатать информацию о режиссёре
    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director.toString());
    }

    // Распечатать список всех актёров
    public void printActors() {
        System.out.println("Актёры спектакля '" + title + "':");
        for (Actor actor : listOfActors) {
            System.out.println("  - " + actor.toString());
        }
    }

    // Добавить нового актёра в спектакль
    public boolean addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Актёр " + newActor.toString() + " уже есть в спектакле!");
            return false;
        }
        listOfActors.add(newActor);
        System.out.println("Актёр " + newActor.toString() + " добавлен в спектакль.");
        return true;
    }

    // Заменить актёра по фамилии
    public boolean replaceActor(String oldActorSurname, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(oldActorSurname)) {
                Actor oldActor = listOfActors.set(i, newActor);
                System.out.println("Актёр " + oldActor.toString() + " заменён на " + newActor.toString());
                return true;
            }
        }
        System.out.println("Актёр с фамилией '" + oldActorSurname + "' не найден в спектакле.");
        return false;
    }
}