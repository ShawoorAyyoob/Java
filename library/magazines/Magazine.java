package library.magazines;

import library.LibraryItem;

public class Magazine extends LibraryItem {
    String issueNumber;

    public Magazine(String title, int yearPublished, String issueNumber) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Number: " + issueNumber);
    }
}
