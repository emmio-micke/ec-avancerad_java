package person;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student("Kalle");

        student1.print();

        Student.print_static();
    }
}
