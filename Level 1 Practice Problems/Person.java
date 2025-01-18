// Creating the Person class
public class Person {

    // Declaring attributes of the Person class
    private String name;
    private int age;

    // Adding a parameterized constructor
    public Person(String name, int age) {
        // Initializing attributes with provided values
        this.name = name;
        this.age = age;
    }

    // Adding a copy constructor
    public Person(Person other) {
        // Cloning attributes from another Person object
        this.name = other.name;
        this.age = other.age;
    }

    // Adding a method to display person details
    public void displayPersonDetails() {
        // Printing the person details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Adding the main method to test the Person class
    public static void main(String[] args) {
        // Creating a Person object using the parameterized constructor
        Person originalPerson = new Person("Alice", 25);
        System.out.println("Original Person:");
        originalPerson.displayPersonDetails();

        // Creating a Person object using the copy constructor
        Person clonedPerson = new Person(originalPerson);
        System.out.println("\nCloned Person:");
        clonedPerson.displayPersonDetails();
    }
}

