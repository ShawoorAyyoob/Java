import java.util.Scanner;

public class ExceptionAsg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter first number: ");
                a = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Error: Enter an integer ");
            }
        }   
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter second number: ");
                b = Integer.parseInt(scanner.nextLine());
                int result = a / b;
                System.out.print("Result : " + result);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Error: invalid input please enter an integer");
            } catch (ArithmeticException e) {
                System.out.print("Error: Division by zero is not valid");
            }
        }
        scanner.close();
    }
}
