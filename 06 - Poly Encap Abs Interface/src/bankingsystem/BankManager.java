package bankingsystem;

// Utility Class: BankManager
import java.util.*;

class BankManager {
    private List<BankAccount> accounts = new ArrayList<>();

    // Adding a bank account to the system
    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    // Processing and displaying details for all bank accounts
    public void processAccounts() {
        // Iterating through each account in the system
        for (BankAccount account : accounts) {
            // Displaying account details
            account.displayDetails();

            // Calculating and displaying interest
            double interest = account.calculateInterest();
            System.out.println("Calculated Interest: " + interest);

            // Displaying loan eligibility if applicable
            if (account instanceof Loanable) {
                double eligibility = ((Loanable) account).calculateLoanEligibility();
                System.out.println("Loan Eligibility: " + eligibility);
            }
            System.out.println("-----------------------------------");
        }
    }
}
