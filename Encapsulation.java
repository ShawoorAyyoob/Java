public class Encapsulation {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Roy");
        person1.setAge(29);
        person1.displayDetails();
    }
}

class Person {
    private String name;
    private int age;

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