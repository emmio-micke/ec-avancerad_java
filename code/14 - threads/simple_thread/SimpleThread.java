package simple_thread;

import java.lang.Thread;

public class SimpleThread extends Thread {
    public SimpleThread(String str) {
        super(str);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());

            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
        }
        System.out.println("Done! " + getName());
    }
}
