public class Director extends Person {
    int numberOfShows;

    public Director(String name, String surname, int numberOfShows, Gender gender) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    // Вывод информации о режиссёре
    @Override
    public String toString() {
        return "Режиссёр{имя='" + name + "', фамилия='" + surname + "'}";
    }
}