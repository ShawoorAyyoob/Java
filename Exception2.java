import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
        String str = null;
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            System.out.println("Length of the string " + str.length() );
        } catch (NullPointerException e) {
            System.out.println("Exception caused by " + e.getMessage());
        }
        finally {
            System.out.println("Winding up in the finally block ");
            scanner.close();
        }
        System.out.println("Thank You");
    }
}