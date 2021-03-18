package person;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println("This is a Person: " + this.name);
    }
}
