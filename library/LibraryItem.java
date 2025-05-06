package library;

public class LibraryItem {
    String title;
    int yearPublished;

    public LibraryItem(String t, int y) {
        this.title = t;
        this.yearPublished = y;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + " , Published in the year - " + yearPublished);
    }
}