package override;

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }

    public void move(String name) {
        System.out.println("Animals can move: " + name);
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}

class Cat extends Animal {
    public void move() {
        System.out.println("Cats can't walk, only lie in the sun");
    }
}

public class TestDog {

    public static void main(String args[]) {
        Animal a = new Animal(); // Animal reference and object
        Animal b = new Dog(); // Animal reference but Dog object

        a.move(); // runs the method in Animal class
        b.move("Fido"); // runs the method in Dog class
    }
}
