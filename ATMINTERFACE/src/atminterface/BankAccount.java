package atminterface;
public class BankAccount {
    private String name;
    private String cardNumber;
    private double balance;

    public BankAccount(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.balance = 5000.0; 
    }

    public double getBalance() {
        return balance;
    }

    // Getter methods for name and cardNumber
    public String getName() {
        return name;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true; // Withdrawal successful
        } else {
            return false; // Insufficient balance
        }
    }
}
