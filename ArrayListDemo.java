import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>();

        courses.add("Data Science");
        courses.add("Web Design");
        courses.add("Machine Learning");
        courses.add(1, "Python");
        courses.remove(3);
        courses.set(2, "Web Development");
        System.out.println(courses);
        System.out.println();
        
        for (String course : courses) {
            System.out.println(course);
        }
        System.out.println("After sorting");
        Collections.sort(courses);
    }
}