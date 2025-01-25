package bankingsystem;

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor for initializing SavingsAccount attributes
    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // Calculating interest for a savings account
    @Override
    public double calculateInterest() {
        return getBalance() * (interestRate / 100);
    }
}
