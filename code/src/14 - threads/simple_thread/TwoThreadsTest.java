package simple_thread;

public class TwoThreadsTest {
    public static void main(String[] args) {
        new SimpleThread("Thread 1").start();
        new SimpleThread("Thread 2").start();
    }
}
