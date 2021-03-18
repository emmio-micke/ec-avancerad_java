package serialize;

import java.io.*;

public class Persist {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(211, "Kalle");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(
                "/Users/micke/www/projects/ec education/java/avancerad java/ec-avancerad_java/code/src/10 - serialize/serialize/student.ser"));

        out.writeObject(s1);
        out.flush();
        out.close();

        System.out.println("success");
    }
}
