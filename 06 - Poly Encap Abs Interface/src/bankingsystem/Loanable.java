package bankingsystem;

// Interface: Loanable
interface Loanable {
    // Applying for a loan
    void applyForLoan(double amount);

    // Calculating loan eligibility
    double calculateLoanEligibility();
}