package library.books;

import library.LibraryItem;

public class Book extends LibraryItem {
    String author;

    public Book(String title, int yearPublished, String author) {
        super(title, yearPublished);
        this.author = author;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + author);
    }
}
