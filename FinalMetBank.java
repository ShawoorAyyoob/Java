public class FinalMetBank {
    
}

class BankAccount {
    double balance;
    public final void displayBalance(){
        System.out.println("Current Balance is : " + balance);
    }
    public void deposit(double amount){
        balance += amount;
    }
}
class SavingsAccount extends BankAccount{
    public void displayBalance()
}

/* 
 Answers to the Questions
  1. It cannot override the method since its being declared as final in the class BankAccount.
  2. For other developers not to make any modifications to the current methods.
*/