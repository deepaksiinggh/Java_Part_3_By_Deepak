package MultiThreding;

public class Deposit extends Thread {
    public void depositMoney() {
        System.out.println("Withdraw money");
    }

    @Override
    public void run() {
        depositMoney();
    }
}
