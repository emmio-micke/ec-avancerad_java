package serialize;

import java.io.*;

class Depersist {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                "/Users/micke/www/projects/ec education/java/avancerad java/ec-avancerad_java/code/src/10 - serialize/serialize/student.ser"));
        Student s = (Student) in.readObject();
        System.out.println(s.id + " " + s.name);

        in.close();
    }
}
