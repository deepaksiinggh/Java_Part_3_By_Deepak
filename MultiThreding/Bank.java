package MultiThreding;

public class Bank {

    public static void main(String[] args) {
        Deposit t1 = new Deposit();
        WithdrawMoney t2 = new WithdrawMoney();

        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }

}
