// Creating the BankAccount class
class BankAccount {

    // Instance variables with different access modifiers
    public String accountNumber; // Public: accessible from anywhere
    protected String accountHolder; // Protected: accessible within the same package and subclasses
    private double balance; // Private: accessible only within this class

    // Constructor to initialize bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void setBalance(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("Invalid balance amount. Balance cannot be negative.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Creating the SavingsAccount subclass
class SavingsAccount extends BankAccount {

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance); // Calling the parent class constructor
    }

    // Method to display SavingsAccount details
    public void displaySavingsAccountDetails() {
        System.out.println("Savings Account Number: " + accountNumber); // Accessing public member
        System.out.println("Savings Account Holder: " + accountHolder); // Accessing protected member
    }
}

// Main class to test the functionality
public class BankAccountManagement {

    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount("12345678", "John Doe", 5000.00);
        account.displayAccountDetails();

        // Modifying and accessing balance using public methods
        account.setBalance(6000.00);
        System.out.println("Updated Balance: $" + account.getBalance());

        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("87654321", "Jane Smith", 8000.00);
        savingsAccount.displaySavingsAccountDetails();
    }
}

