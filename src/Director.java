class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    // Геттер
    public int getNumberOfShows() {
        return numberOfShows;
    }

    // Сеттер
    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    @Override
    public String toString() {
        return super.toString() + ", количество спектаклей: " + numberOfShows;
    }
