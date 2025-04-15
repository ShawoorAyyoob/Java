public class factPract {
    public static void main(StringDemo[] args) {
        calcFact(5);
    }
    public static void calcFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
    }
}
