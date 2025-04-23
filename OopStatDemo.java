public class OopStatDemo {
    public static void main(String[] args) {
        MathUtils.square(5);
        int fact = MathUtils.factorial(5);
        System.out.println("Factorial of 5 = " + fact);
        boolean isPrime = MathUtils.isPrime(5);
        System.out.println(" is prime number " + isPrime);
    }
}

class MathUtils {
    static void square(int n) {
        int sq = n * n;
        System.out.println("Square of the number " + n + " = " + sq);
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
    static boolean isPrime(int n) {
        boolean prime = true;

        for (int i = 2; i < n; i++) {
            int remainder = n % i;
            if (remainder == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}