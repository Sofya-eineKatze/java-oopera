class Person {
    String name;
    String surname;
    Gender gender;

    // Конструктор с параметрами
    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }
}