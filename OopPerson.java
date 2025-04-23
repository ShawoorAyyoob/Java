public class OopPerson {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25) ;
        person1.displayDetails();

        Person person2 = new Person("Mary", 35);
        person2.displayDetails();
    }
}
    class Person {
        String name;
        int age;

        Person() {
            this.name = "Alex";
            this.age = 40;
        }

        Person(String n, int a) {
            this.name = n;
            this.age = a;
        }

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }