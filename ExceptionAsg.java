import java.util.Scanner;

public class ExceptionAsg {
    public static void main(String[] args) {
        int a = 0, b = 0, result = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter First number : ");
            a = scanner.nextInt();

            do {
                System.out.print("Enter Second number : ");
                b = scanner.nextInt();

            } while (b == 0);

            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage() + " is not allowed. Please enter a valid number.");

        } finally {
            System.out.println("Result: " + result);
        }
    }
}
