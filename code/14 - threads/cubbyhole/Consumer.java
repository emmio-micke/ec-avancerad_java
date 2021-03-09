package cubbyhole;

public class Consumer extends Thread {
    private CubbyHole cubbyhole;
    private int id;

    public Consumer(CubbyHole c, int id) {
        cubbyhole = c;
        this.id = id;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                value = cubbyhole.get();
                System.out.println("Consumer #" + this.id + " get: " + value);
            }
        }
    }
}
