public class Actor extends Person {


    public Actor(String name, String surname, int height, Gender gender) {
        super(name, surname, height, gender);
    }

    // Вывод информации об актёре (имя, фамилия и рост)
    @Override
    public String toString() {
        return "Актёр{имя='" + name + "', фамилия='" + surname + "', рост='" + height + "'}";
    }


}
