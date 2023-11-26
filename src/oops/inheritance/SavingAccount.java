package oops.inheritance;

public class SavingAccount extends BankAccount {
    public SavingAccount(int accountNo, float balance) {
        super(accountNo, balance);
    }

    @Override
    void deposit(float amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    void withdraw(float amount) {
        if (amount > 20000.0) {
            System.out.println("Withdrawal failed: PAN card required for amounts greater than 20000.");
            return;
        }
        setBalance(getBalance() - amount);
    }
}
