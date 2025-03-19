// Define the BankAccount class
class BankAccount {
    // Declare attributes with appropriate access modifiers
    public String accountHolder;    // Public access
    private double balance;         // Private access
    protected String accountType;   // Protected access

    // Constructor to initialize the attributes
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Main class where the program starts
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount object with initial values
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        // Deposit and withdraw some amounts
        myAccount.deposit(250.0);   // Add 250 to balance
        myAccount.withdraw(100.0);  // Deduct 100 from balance

        // Print account information and current balance
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
