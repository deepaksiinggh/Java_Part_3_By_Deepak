package MultiThreding;

public class MultiThreding extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Main starts");
        MultiThreding t1 = new MultiThreding();
        t1.setPriority(10);
        t1.start();
        MultiThreding t2 = new MultiThreding();
        t2.setPriority(1);
        t2.start();

        System.out.println("Main ends");
    }
}
