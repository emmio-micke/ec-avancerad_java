package person;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    public void print() {
        System.out.println("This is a Student: " + this.name);
    }

    public static void print_static() {
        System.out.println("This is a static method");
    }
}
