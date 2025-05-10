import java.util.Scanner;

public class ExceptionAsg {
    public static void main(String[] args) {
        int a = 0, b = 0, result = 0;
        boolean validInput = true;

        while (!validInput) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter first number: ");
                a = scanner.nextInt();
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter an integer ");
            }
        }
        while (!validInput) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter second number: ");
                b = scanner.nextInt();
                validInput = true;
                result = a / b;
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage() + result);
            } finally {
                System.out.println("Result: " + result);
            }
        }
    }
}
