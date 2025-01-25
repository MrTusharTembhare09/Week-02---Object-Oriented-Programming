package bankingsystem;

// Abstract Class: BankAccount
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    // Constructor for initializing bank account attributes
    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getting account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Setting account number
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getting holder name
    public String getHolderName() {
        return holderName;
    }

    // Setting holder name
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    // Getting account balance
    public double getBalance() {
        return balance;
    }

    // Depositing an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depositing: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Withdrawing an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawing: " + amount + ". Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    // Abstract method for calculating interest
    public abstract double calculateInterest();

    // Displaying account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}
