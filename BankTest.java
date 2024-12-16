// File for BankTest.java
public class BankTest {
    public static void main(String[] args) {
        // Create a BankAccount
        BankAccount account1 = new BankAccount("John", "Doe", 12345);
        account1.deposit(1200);
        account1.withdrawal(250);
        account1.accountSummary();

        // Create a CheckingAccount
        CheckingAccount account2 = new CheckingAccount("Jane", "Doe", 67890, 1.5);
        account2.deposit(800);
        account2.processWithdrawal(1000); // Overdraft example
        account2.displayAccount();
    }
}
