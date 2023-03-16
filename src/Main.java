public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345689, 0, "John Doe", 0.05);
        account.deposit(1000);
        account.withdraw(500);
        account.addInterest();
        System.out.println(account.getBalance());
    }
}