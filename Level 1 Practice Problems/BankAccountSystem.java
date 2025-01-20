// Creating the BankAccount class
class BankAccount {

    // Static variable shared across all accounts
    static String bankName = "Global Bank";

    // Static variable to count the total number of accounts
    private static int totalAccounts = 0;

    // Final variable for account number (immutable once assigned)
    private final String accountNumber;

    // Instance variable for account holder name
    private String accountHolderName;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber; // Using this to resolve ambiguity
        this.accountHolderName = accountHolderName; // Using this to resolve ambiguity
        totalAccounts++; // Incrementing total accounts on creation
    }

    // Static method to get the total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Instance method to display account details
    public void displayAccountDetails() {
        // Using instanceof to ensure this object is of type BankAccount
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
        } else {
            System.out.println("Object is not an instance of BankAccount.");
        }
    }
}

// Main class to test the functionality
public class BankAccountSystem {

    public static void main(String[] args) {
        // Creating BankAccount objects
        BankAccount account1 = new BankAccount("12345", "Alice");
        BankAccount account2 = new BankAccount("67890", "Bob");

        // Displaying account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Displaying the total number of accounts using a static method
        BankAccount.getTotalAccounts();
    }
}
