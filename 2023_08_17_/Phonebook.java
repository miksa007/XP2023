
import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Person> people;

    public Phonebook() {
        this.people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getPeople() {
        return people;
    }
}

