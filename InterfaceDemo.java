public class InterfaceDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        work(dog);

        System.out.println();

        Animal cat = new Cat();
        work(cat);
    }

    static void work(Animal animal) {
        animal.makeSound();
        animal.eat();
    }
}

interface Animal {
    void eat();
    void makeSound();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats 🍖");
    }

    public void makeSound() {
        System.out.println("Dog barks 🐶");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats 🐟");
    }

    public void makeSound() {
        System.out.println("Cat meows 🐈");
    }
}