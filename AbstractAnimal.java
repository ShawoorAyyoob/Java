public class AbstractAnimal {
    public static void main(String[] args) {
        Animal myAnimal1 = new Dog();
        Animal myAnimal2 = new Cat();

        myAnimal1.wildLife();
        myAnimal1.makesound();

        myAnimal2.wildLife();
        myAnimal2.makesound();
    }
}

abstract class Animal {
    abstract void makesound();
    
    void wildLife() {
        System.out.println("...Animal Wildlife...");
    }
}

class Dog extends Animal{
     @Override
     void makesound() {
        System.out.println("Dog barks");
     }
}

class Cat extends Animal {
    @Override
    void makesound() {
        System.out.println("Cat meows");
    }
}