public class OopBankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Max", 5246, 51500);
        account.deposit(6000);
        account.withdraw(2000);
    }
}

class BankAccount{
    String name;
    int accountNumber;
    float balance;

    BankAccount(String n, int a, float b) {
        this.name = n;
        this.accountNumber = a;
        this.balance = b;
    }

    void deposit(float amount) {
        if (amount < balance) {
            System.out.println("Amount cannot be negative");
            return;
        }
        System.out.println("Amount " + amount + " is being deposited into your account");
        System.out.println("Dear " + name + " , Your new balance : " + this.balance);
    }
    
    void withdraw(float amount) {
        if (amount > balance) {
            System.out.println("You are low on balance, " + name);
            return;
        }
        System.out.println("Amount " + amount + " has being withdrawn from your account");
        System.out.println("Dear " + name + " , Your current balance : " + this.balance);
    }
}