public class InheritanceLib {
    public static void main(String[] args) {
        Book book = new Book("Atomic Bomb", 1945, "James Oppenheimer");
        book.displayInfo();

        System.out.println();

        Magazine magazine = new Magazine("Khaleej Times", 2006, "45");
        magazine.displayInfo();
    }
}

class LibraryItem {
    protected String title;
    protected int yearPublished;

    LibraryItem(String t, int y) {
        this.title = t;
        this.yearPublished = y;
    }

    void displayInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Year Published: " + this.yearPublished);
    }
}

class Book extends LibraryItem {
    protected String author;

    Book(String title, int yearPublished, String author) {
        super(title, yearPublished);
        this.author = author;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + this.author);
    }
}

class Magazine extends LibraryItem {
    protected String issueNumber;

    Magazine(String title, int yearPublished, String issueNumber) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + this.issueNumber);
    }
}