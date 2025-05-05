public class FinalLib {
    public static void main(String[] args) {
    }
}
final class LibraryItem{
    public String title;

    LibraryItem(String t){
        this.title = t;
    }
    void displayTitle(){
        System.out.println("Title of the Book is " + title);
    }
}
// class Book extends LibraryItem{
    
// }

/* 
 Answers to the Questions
  1. The class Book cannot subclass the class Library Item as its being declared as final class
  2. When the class has sufficient methods or it doesnt need any other methods in future.
*/