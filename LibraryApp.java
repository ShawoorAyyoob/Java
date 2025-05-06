import library.books.Book;
import library.magazines.Magazine;
import library.LibraryItem;

public class LibraryApp {
    public static void main(String[] args) {
        Book book = new Book("Last of Us", 1996, "Roy");
        book.displayInfo();

        System.out.println();
        
        Magazine magazine = new Magazine("Khaleej Times", 1971, "James");
        magazine.displayInfo();
    }
}
