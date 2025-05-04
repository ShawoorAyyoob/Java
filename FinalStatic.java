public class FinalStatic {
    public static void main(String[] args) {
        MathConstants math1 = new MathConstants();
        math1.displayDetails();
    }
}
class MathConstants{
    public static final double PI = 3.14159;
    public static final double E = 2.718;

    public void displayDetails(){
        System.out.println("Value of PI = " + PI);
        System.out.println("Value of E = " + E);
    }
}
/* 
 Answers to the Questions
  1. Final is being declared to these static variables since this values are constant globally and wont change.
*/