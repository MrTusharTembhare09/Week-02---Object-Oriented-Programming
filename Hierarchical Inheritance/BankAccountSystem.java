// Base class BankAccount
class BankAccount {
    // Defining attributes of the BankAccount class
    String accountNumber;
    double balance;
    
    // Constructor to initialize the BankAccount attributes
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    // Method to display basic account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    
    // Method to display account type (to be overridden by subclasses)
    public void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}

// Subclass SavingsAccount which extends BankAccount
class SavingsAccount extends BankAccount {
    // Defining additional attribute for SavingsAccount
    double interestRate; // Interest rate for the savings account
    
    // Constructor to initialize both BankAccount and SavingsAccount attributes
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        // Calling the constructor of the base class (BankAccount)
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    // Overriding displayAccountType to show Savings Account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
    
    // Method to display interest rate
    public void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass CheckingAccount which extends BankAccount
class CheckingAccount extends BankAccount {
    // Defining additional attribute for CheckingAccount
    double withdrawalLimit; // Withdrawal limit for checking accounts
    
    // Constructor to initialize both BankAccount and CheckingAccount attributes
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        // Calling the constructor of the base class (BankAccount)
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    
    // Overriding displayAccountType to show Checking Account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
    
    // Method to display withdrawal limit
    public void displayWithdrawalLimit() {
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

// Subclass FixedDepositAccount which extends BankAccount
class FixedDepositAccount extends BankAccount {
    // Defining additional attribute for FixedDepositAccount
    int lockInPeriod; // Lock-in period for the fixed deposit account in months
    
    // Constructor to initialize both BankAccount and FixedDepositAccount attributes
    public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        // Calling the constructor of the base class (BankAccount)
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }
    
    // Overriding displayAccountType to show Fixed Deposit Account type
    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
    
    // Method to display lock-in period
    public void displayLockInPeriod() {
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }
}

// Main class to demonstrate the hierarchical inheritance
public class BankAccountSystem {
    public static void main(String[] args) {
        // Creating a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("SA12345", 5000.0, 3.5);
        savingsAccount.displayAccountDetails();
        savingsAccount.displayAccountType();
        savingsAccount.displayInterestRate();
        
        System.out.println("\n--------------------------\n");
        
        // Creating a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount("CA67890", 2000.0, 1000.0);
        checkingAccount.displayAccountDetails();
        checkingAccount.displayAccountType();
        checkingAccount.displayWithdrawalLimit();
        
        System.out.println("\n--------------------------\n");
        
        // Creating a FixedDepositAccount object
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("FDA11223", 10000.0, 12);
        fixedDepositAccount.displayAccountDetails();
        fixedDepositAccount.displayAccountType();
        fixedDepositAccount.displayLockInPeriod();
    }
}
