class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor – uses setter to enforce validation
    public BankAccount(String accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        setBalance(initialDeposit); // validate and set
    }

    // Getters (camelCase)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter for balance – only called internally (we could make it private)
    // but we keep it public if we want to allow external balance changes (though we don't).
    // In this design, we only allow changes via deposit/withdraw.
    private void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Warning: Initial balance cannot be negative. Setting to 0.");
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        this.balance += amount;
        System.out.printf("Deposited ₹%.2f. New balance: ₹%.2f%n", amount, this.balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > this.balance) {
            System.out.println("Insufficient funds. Available balance: ₹" + this.balance);
            return;
        }
        this.balance -= amount;
        System.out.printf("Withdrew ₹%.2f. Remaining balance: ₹%.2f%n", amount, this.balance);
    }

    // Display account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.printf("Balance: ₹%.2f%n", balance);
        System.out.println("---------------------------");
    }

    // Optional: override toString for easy printing
    @Override
    public String toString() {
        return String.format("BankAccount[%s, %s, ₹%.2f]", accountNumber, accountHolderName, balance);
    }
}

// Main class
public class BankClass {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("1", "Raj", 1000);
        BankAccount acc2 = new BankAccount("2", "Sham", 2000);

        System.out.println("========== Account 1 ==========");
        acc1.displayAccountInfo();
        acc1.deposit(220);
        acc1.withdraw(300);
        acc1.displayAccountInfo();

        System.out.println("========== Account 2 ==========");
        acc2.displayAccountInfo();
        acc2.deposit(400);
        acc2.withdraw(500);
        acc2.displayAccountInfo();

        // Bonus: test edge cases
        System.out.println("========== Edge Cases ==========");
        BankAccount acc3 = new BankAccount("3", "Test", -50); // should warn and set to 0
        acc3.deposit(-100); // rejected
        acc3.withdraw(-50); // rejected
        acc3.withdraw(10);  // insufficient
        acc3.displayAccountInfo();
    }
}