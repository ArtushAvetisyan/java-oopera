public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, int height, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    // Вывод информации об актёре (имя, фамилия и рост)
    @Override
    public String toString() {
        return "Актёр{имя='" + getName() + "', фамилия='" + getSurname() + "', рост='" + height + "'}";
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
