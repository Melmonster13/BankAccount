// File for CheckingAccount.java
public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
    }

    // Processing the withdrawal with overdraft fee
    public void processWithdrawal(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            withdrawal(amount);
        } else {
            System.out.println("Overdraft! $30 fee charged.");
            withdrawal(amount);
            withdrawal(30); // Overdraft fee
        }
    }

    // Display the account details with the interest rate
    public void displayAccount() {
        accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
