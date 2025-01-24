// Defining the superclass Animal
class Animal {
    String name;
    int age;

    // Adding constructor to initialize Animal attributes
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Defining a generic makeSound() method
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Defining the subclass Dog
class Dog extends Animal {
    // Adding constructor to initialize Dog attributes
    public Dog(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound() for Dog
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Defining the subclass Cat
class Cat extends Animal {
    // Adding constructor to initialize Cat attributes
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound() for Cat
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Defining the subclass Bird
class Bird extends Animal {
    // Adding constructor to initialize Bird attributes
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound() for Bird
    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp!");
    }
}

// Main class to demonstrate the Animal hierarchy
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Creating objects for each subclass
        Animal dog = new Dog("Buddy", 5);
        Animal cat = new Cat("Whiskers", 3);
        Animal bird = new Bird("Tweety", 1);

        // Making each animal sound
        System.out.println("Animal Sounds:");
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}