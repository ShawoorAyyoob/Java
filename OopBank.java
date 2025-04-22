public class OopBank {
    public static void main(String[] args) {
        Bank account = new Bank(7178, "Hitler", 15000);
        account.deposit(5000.50f);
        account.withdraw(2000.50f);
    }
}

class Bank{
    int accountNumber;
    String name;
    float balance;

    Bank(int a, String n, float b){
        this.accountNumber = a;
        this.name = n;
        this.balance = b;
    }

    void deposit(float amount){
        if(amount < 0 ){
             System.out.println("Amount cannot be negative");
         return;
        }
        this.balance = this.balance + amount;
        System.out.println("Amount " + amount + " is being deposited in your acoount");
        System.out.println("Your current balance is " + this.balance);
    }

    void withdraw(float amount){
        if(amount > balance ){
            System.out.println("You have insufficient balance");
        return;
       }
       System.out.println("Amount " + amount + " is being withdrawn from your acoount");
       this.balance = this.balance - amount;
       System.out.println("Your current balance is " + this.balance);
    }

}
    