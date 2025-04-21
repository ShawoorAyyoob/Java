public class OopBook {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "Aeraf", 7800, 100);
        book1.displayBook();
    }
}

class Book {
    String title;
    String author;
    double price;
    int pages;

    Book(String t, String a, double p, int s) {
        this.title = t;
        this.author = a;
        this.price = p;
        this.pages = s;
    }

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Pages: " + pages);
    }
}