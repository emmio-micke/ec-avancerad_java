package head;

public class Head {
    public void printMe() {
        System.out.println("Head");
    }
}

class DollHead extends Head {
    @Override
    public void printMe() {
        System.out.println("DollHead");
    }
}