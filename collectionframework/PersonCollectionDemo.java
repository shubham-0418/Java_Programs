package collectionframework;


import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Person other) {
        return this.firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

public class PersonCollectionDemo {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Priscilla", "Wagner"));
        people.add(new Person("Tom", "Parker"));
        people.add(new Person("Elvis", "Presley"));

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }
    }
}

