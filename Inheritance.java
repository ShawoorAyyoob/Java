public class Inheritance {
    public static void main(String[] args) {
        Student student = new Student("Farhan", 21, "17");
        student.displayDetails();
    }
}

class Person {
    protected String name;
    protected int age;

    Person() {
        this.name = "Alex";
        this.age = 0;
    }

    Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    String getName() {
        return this.name;
    }

    void setName(String n) {
        if (!n.matches("[a-zA-Z ]+")) {
            System.out.println("Name can only contain alphabets and spaces");
            return;
        }
        this.name = n;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int a) {
        if (a < 0) {
            System.out.println("Age cannot be negative");
            return;
        }
        if (a > 100) {
            System.out.println("Age cannot be greater than 100");
            return;
        }
        this.age = a;
    }

    void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

class Student extends Person {
    protected String studentId;

    Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Student Id: " + this.studentId);
    }
}