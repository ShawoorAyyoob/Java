public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("85867", 10000);
        account.deposit(5000);
        account.withdraw(20000);
        account.displayAccountInfo();
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String a, double b) {
        this.accountNumber = a;
        this.balance = b;
    }

    void deposit(double amount) {
        this.balance = this.balance + amount;
        return;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("*** You have insufficient balance ***");
        }
        this.balance = this.balance - amount;
        return;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    void displayAccountInfo() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Current Balance: " + this.balance);
    }
}