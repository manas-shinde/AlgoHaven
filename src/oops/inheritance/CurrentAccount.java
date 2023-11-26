package oops.inheritance;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(int accountNo, float balance) {
        super(accountNo, balance);
    }

    @Override
    void deposit(float amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    void withdraw(float amount) {
        if (getBalance() - amount < 2000) {
            System.out.println("Withdrawal failed: Insufficient balance.");
            return;
        }
        setBalance(getBalance() - amount);
    }
}
