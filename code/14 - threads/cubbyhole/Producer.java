package cubbyhole;

public class Producer extends Thread {
    private CubbyHole cubbyhole;
    private int id;

    public Producer(CubbyHole c, int id) {
        cubbyhole = c;
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cubbyhole.put(i, j);

                // System.out.println("Producer #" + this.id + " put: (" + i + ", " + j + ")");

                try {
                    sleep((int) (Math.random() * 100));
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
            }
        }
    }
}