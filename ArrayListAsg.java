import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListAsg {
    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();
        
        books.add("Ping Pong");
        books.add("Mockingbird");
        books.add("1945");
        books.add("Hustle");
        books.add("Charles Xavier");

        for (String book : books) {
            System.out.println(book);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a title to search book: ");
        String title2 = scanner.nextLine();
        books.contains(title2);
        System.out.print("Enter a book title to remove: ");
        String remove = scanner.nextLine();
        books.remove(remove);

        Collections.sort(books);
    }
}