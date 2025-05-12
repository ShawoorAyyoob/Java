@FunctionalInterface
interface Factorial {
    int calcFact(int n);
}

public class LambdaFact {
    public static void main(String[] args) {

        Factorial factorial = (n) -> {
            int fact = 1;
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            return fact;
        };
        int n = 5;
        System.out.println("Factorial of " + n + " = " + factorial.calcFact(n));
    }
}