import java.util.Scanner;

public class TernaryOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int n = scanner.nextInt();
        int remainder = n % 2;

        String result = (remainder == 0 ) ? " Even Number" : " Odd Number";
        System.out.println(result);
    }
}