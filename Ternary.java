import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        int age = scanner.nextInt();

        String result = (age >= 18)? ", You are Eligible to Vote" :", You are Eligible to Vote";
        System.out.println( name + result);
    }
}
