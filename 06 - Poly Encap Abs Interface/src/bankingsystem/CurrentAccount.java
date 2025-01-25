package bankingsystem;

// Subclass: CurrentAccount
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit;

    // Constructor for initializing CurrentAccount attributes
    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Calculating interest for a current account (no interest in this case)
    @Override
    public double calculateInterest() {
        return 0; // Current accounts typically do not earn interest
    }

    // Applying for a loan
    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for a loan of: " + amount);
    }

    // Calculating loan eligibility based on balance and overdraft limit
    @Override
    public double calculateLoanEligibility() {
        return getBalance() + overdraftLimit;
    }
}
