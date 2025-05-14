import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Cat> optionalCat = getCatByName("Henry");
        if (optionalCat.isPresent()) {
            Cat cat = optionalCat.get();
            cat.displayInfo();
        }
        else {
            System.out.println("Cat is not present.");
        }
    }
    
    public static Optional<Cat> getCatByName(String name) {
        Cat cat = new Cat("Henry", 5);
        return Optional.ofNullable(cat);
    }
}
class Cat {
    String name;
    int age;

    Cat(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}