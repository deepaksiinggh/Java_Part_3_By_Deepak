package MultiThreding;

public class TestRunnableDriver {
    public static void main(String[] args) {
        System.out.println("Main start");
        TestRunnable t1 = new TestRunnable();
        Thread thredt1 = new Thread(t1);
        thredt1.start();
        TestRunnable t2 = new TestRunnable();
        Thread thredt2 = new Thread(t2);
        thredt2.start();
        thredt2.start();

        System.out.println("Main End");

    }
}
