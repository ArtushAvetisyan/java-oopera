import java.util.Objects;

public class Person {
    String name;
    String surname;
    int height;
    Gender gender;

    // 1-й конструктор для актёра (с указанием роста)
    public Person(String name, String surname, int height, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.gender = gender;
    }

    // 2-й конструктор для режиссёра (без указание рост)
    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    /* Переопределение метода equals и hashCode (сделал в классе Person, чтобы Director тоже наследовал).
       Использовал автоматический генератор, но дополнил вручную. Сравнил ссылки объектов (первая строка),
       также убрал сравнения пола (gender), так как в задании требуется сравнивать по имени, фамилии и по росту. */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Double.compare(height, person.height) == 0 && Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
    }
}
