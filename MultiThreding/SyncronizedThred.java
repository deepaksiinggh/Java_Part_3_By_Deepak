package MultiThreding;

public class SyncronizedThred implements Runnable {
    public void run() {
        m1();
    }

    public synchronized void m1() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();
    }
}
