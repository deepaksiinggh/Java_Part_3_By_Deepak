package MultiThreding;

public class WithdrawMoney extends Thread {

    public void withdrawMoney() {
        System.out.println("Withdraw money");
    }

    @Override
    public void run() {
        withdrawMoney();
    }

}
