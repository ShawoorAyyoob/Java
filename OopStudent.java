public class OopStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Fisher", 31, 77);
        student1.calcGrade();
    }
}

class Student {
    String name;
    int rollNumber;
    double marks;

    Student(String n, int r, double m) {
        this.name = n;
        this.rollNumber = r;
        this.marks = m;
    }

    void calcGrade() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75){
            System.out.println("Grade B");
        }
        else if (marks >= 50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }
    }
}