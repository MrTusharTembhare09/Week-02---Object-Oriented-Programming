package bankingsystem;

// Main Class: BankingSystem
public class BankingSystem {
    public static void main(String[] args) {
        // Creating an instance of BankManager
        BankManager manager = new BankManager();

        // Adding a savings account
        SavingsAccount savingsAcc = new SavingsAccount("SA12345", "Alice", 50000, 4.5);
        manager.addAccount(savingsAcc);

        // Adding a current account
        CurrentAccount currentAcc = new CurrentAccount("CA67890", "Bob", 20000, 10000);
        manager.addAccount(currentAcc);

        // Processing and displaying all accounts
        manager.processAccounts();
    }
}
