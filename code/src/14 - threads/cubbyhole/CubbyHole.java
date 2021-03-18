package cubbyhole;

public class CubbyHole {
    private int x, y;
    private boolean available = false;

    public synchronized int get() {
        while (available == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("There was an error: " + e.getMessage());
            }
        }

        available = false;
        notifyAll();
        System.out.println("get: " + (x + y));
        return x + y;
    }

    public synchronized void put(int i, int j) {
        while (available == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println("There was an error: " + e.getMessage());
            }
        }

        x = i;
        y = j;

        available = true;
        notifyAll();

        System.out.println("put: " + i + ", " + j);
    }
}

// Attempt 1
/*
 * public class CubbyHole { private int x, y;
 * 
 * public synchronized int get() { return x + y; }
 * 
 * public synchronized void put(int i, int j) { x = i; y = j; } }
 */

// Attempt 2
/*
 * public class CubbyHole { private int x, y; private boolean available = false;
 * 
 * public synchronized int get() { if (available == true) { available = false;
 * return x + y; } }
 * 
 * public synchronized void put(int i, int j) { if (available == false) {
 * available = true; x = i; y = j; } } }
 */
