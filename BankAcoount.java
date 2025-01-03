// Program for to Demonstarate the Concepts Contructor overloading and method overloading 
package util;
 
class BankAccount {
    private static int totalAccounts = 0; // Static variable to track total accounts
    private String name;
    private String accountType;
    private double balance;

    // Constructor 1: Only account name
    public BankAccount(String name) {
        this(name, 0, "Savings");
    }

    // Constructor 2: Account name and initial deposit
    public BankAccount(String name, double initialDeposit) {
        this(name, initialDeposit, "Savings");
    }

    // Constructor 3: Account name, initial deposit, and account type
    public BankAccount(String name, double initialDeposit, String accountType) {
        this.name = name;
        this.balance = initialDeposit;
        this.accountType = accountType;
        totalAccounts++;
    }

    // Deposit method: Overloaded
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void deposit(double amount, String description) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount + " (" + description + "), New Balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Static method to get total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Name: " + name + ", Account Type: " + accountType + ", Balance: " + balance);
    }

    // Main method to test the class
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Girish");
        acc1.deposit(1000);
        acc1.displayAccountInfo();

        BankAccount acc2 = new BankAccount("Prasad", 2000); 
        acc2.deposit(500, "Salary Deposit");
        acc2.displayAccountInfo();

        BankAccount acc3 = new BankAccount("Amar", 3000, "Current");
        acc3.displayAccountInfo();

        System.out.println("Total Accounts Created: " + BankAccount.getTotalAccounts());
    }
}
