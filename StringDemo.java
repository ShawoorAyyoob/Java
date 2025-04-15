public class StringDemo {
    public static void main(String[] args) {
        String firstName = "Steve ";
        String lastName = "Austin ";
        String newName = firstName.concat(lastName);
        System.out.println(firstName.contains("te"));
        System.out.println(newName.toUpperCase());
        System.out.println(lastName.endsWith("Austin "));
        System.out.println(firstName.indexOf("e"));
        System.out.println(firstName.length());
        System.out.println(newName.substring(2,8));

        printString(" Shawoor");
    }
    public static void printString(String name) {
        if (name == " " ) {
            System.out.println("Welcome to Class of Java");
        } else {
            System.out.println("Welcome to Class of Java" + name);
        }
    }
}
