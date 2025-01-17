// Creating the BankAccount class to represent a bank account
public class BankAccount {

    // Declaring attributes for the bank account
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Creating a constructor to initialize the bank account attributes
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Depositing money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdrawing money from the account (only if sufficient balance exists)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    // Displaying the current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Creating the main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating a BankAccount object with sample data
        BankAccount account = new BankAccount("Alice Smith", "123456789", 5000.00);

        // Displaying the initial balance
        account.displayBalance();

        // Depositing money
        account.deposit(1500);

        // Withdrawing money
        account.withdraw(2000);

        // Trying to withdraw more money than the current balance
        account.withdraw(6000);

        // Displaying the final balance
        account.displayBalance();
    }
}
