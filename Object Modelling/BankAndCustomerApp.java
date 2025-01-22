import java.util.ArrayList;

// Define the Account class that represents a bank account
class Account {
    private String accountNumber;
    private double balance;

    // Constructor to initialize the account with a number and an initial balance
    // Opening a new bank account for a customer
    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Method to deposit money into the account
    // Depositing money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money from the account
    // Withdrawing money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Method to check the current balance of the account
    // Checking the balance of the account
    public double getBalance() {
        return balance;
    }
}

// Define the Customer class that represents a customer of the bank
class Customer {
    private String name;
    private ArrayList<Account> accounts;  // Each customer can have multiple accounts

    // Constructor to initialize the customer with a name
    // Creating a new customer with a name
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Getter for customer name
    public String getName() {
        return name;
    }

    // Method to view the balance of all accounts for the customer
    // Viewing the balance of all the accounts for the customer
    public void viewBalance() {
        System.out.println("Balance details for " + name + ":");
        for (Account account : accounts) {
            System.out.println("Account " + account.getAccountNumber() + " Balance: $" + account.getBalance());
        }
    }

    // Method to open a new account for the customer (associated with the bank)
    // Opening a new bank account for the customer
    public void openAccount(Account account) {
        accounts.add(account);
        System.out.println("Account opened for " + name + " with Account Number: " + account.getAccountNumber());
    }
}

// Define the Bank class that represents the bank
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;  // A bank has multiple customers

    // Constructor to initialize the bank with a name
    // Creating a new bank with a specific name
    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Getter for bank name
    public String getBankName() {
        return bankName;
    }

    // Method to open an account for a customer at the bank
    // Opening a new account for a customer in the bank
    public void openAccountForCustomer(Customer customer, Account account) {
        customer.openAccount(account);  // Add the account to the customer
        customers.add(customer);  // Add the customer to the bank
        System.out.println("Account opened for customer " + customer.getName() + " in " + bankName);
    }

    // Method to view details of all customers in the bank
    // Viewing details of all customers and their accounts in the bank
    public void viewAllCustomers() {
        System.out.println("Customers in " + bankName + ":");
        for (Customer customer : customers) {
            System.out.println("Customer Name: " + customer.getName());
            customer.viewBalance();  // Display each customer's account balance details
        }
    }
}

// Main class to demonstrate the association between Bank and Customer
public class BankAndCustomerApp {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("National Bank");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Create bank accounts for customers
        Account account1 = new Account("A123", 1000.00);  // Account for Alice
        Account account2 = new Account("B456", 500.00);   // Account for Bob
        Account account3 = new Account("A789", 1500.00);  // Another account for Alice

        // Open accounts for customers
        bank.openAccountForCustomer(customer1, account1);  // Alice opens account1
        bank.openAccountForCustomer(customer2, account2);  // Bob opens account2
        bank.openAccountForCustomer(customer1, account3);  // Alice opens another account

        // Perform some transactions
        account1.deposit(200);  // Alice deposits money into her first account
        account2.withdraw(50);  // Bob withdraws money from his account

        // View balances of all customers in the bank
        bank.viewAllCustomers();
    }
}
