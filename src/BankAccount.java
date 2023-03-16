

public class BankAccount {
    long accountNumber;
    private double balance;
    final String ownerName;
    final private double interestRate;

    BankAccount(long accountNumber, double balance, String ownerName, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        return balance = amount + balance;
    }

    public double withdraw(double amount) {
        return balance = balance - amount;
    }

    public double addInterest() {
        return balance = (balance * interestRate) + balance;
    }
}

