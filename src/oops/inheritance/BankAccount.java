package oops.inheritance;

public abstract class BankAccount {
    private int accountNo;
    private float balance;

    protected BankAccount(int accountNo, float balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    abstract void deposit(float amount);

    abstract void withdraw(float amount);
}