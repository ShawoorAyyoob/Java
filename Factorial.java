public class Factorial {
    
    public static void main(String[] args) {
        printFactorial(4);
    }
   
    public static void printFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
