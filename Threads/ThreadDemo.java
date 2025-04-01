package Threads;

public class ThreadDemo {

    public synchronized void waiting() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Is waiting ");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Come back to running state and i have resume my task ");
    }

    public synchronized void notifyThatThread() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " is notifying ");
        notifyAll();
    }

    public static void main(String[] args) {
        ThreadDemo output = new ThreadDemo();
        System.out.println("Main start");
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                output.waiting();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                output.waiting();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                output.waiting();
            }
        });
        System.out.println("Main ends");
    }
}
