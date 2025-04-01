package MultiThreding;

public class AnnonimousRunnable {
    public synchronized void m1() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        AnnonimousRunnable a1 = new AnnonimousRunnable();
        System.out.println("Main start");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                a1.m1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                a1.m1();
            }
        });
        t1.start();
        t2.start();
        System.out.println("Main End");

    }
}
