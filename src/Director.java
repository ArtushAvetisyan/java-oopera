public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, int numberOfShows, Gender gender) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    // Вывод информации о режиссёре
    @Override
    public String toString() {
        return "Режиссёр{имя='" + getName() + "', фамилия='" + getSurname() + "'}";
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }
}