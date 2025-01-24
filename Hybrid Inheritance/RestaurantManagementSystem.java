// Interface Worker
interface Worker {
    // Method that must be implemented by classes that implement this interface
    void performDuties();
}

// Base class Person
class Person {
    // Defining common attributes for all persons
    String name;
    int id;

    // Constructor to initialize the Person attributes
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display basic information about the person
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Subclass Chef which extends Person and implements Worker
class Chef extends Person implements Worker {
    // Defining additional attribute for Chef
    String specialty; // Chef's specialty

    // Constructor to initialize both Person and Chef attributes
    public Chef(String name, int id, String specialty) {
        super(name, id); // Calling the constructor of Person
        this.specialty = specialty;
    }

    // Overriding the performDuties method from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious meals with a specialty in " + specialty + ".");
    }

    // Method to display the chef's specialty
    public void displaySpecialty() {
        System.out.println("Specialty: " + specialty);
    }
}

// Subclass Waiter which extends Person and implements Worker
class Waiter extends Person implements Worker {
    // Defining additional attribute for Waiter
    String section; // Section where the waiter serves

    // Constructor to initialize both Person and Waiter attributes
    public Waiter(String name, int id, String section) {
        super(name, id); // Calling the constructor of Person
        this.section = section;
    }

    // Overriding the performDuties method from Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers in the " + section + " section.");
    }

    // Method to display the waiter's section
    public void displaySection() {
        System.out.println("Serving Section: " + section);
    }
}

// Main class to demonstrate the hybrid inheritance
public class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Creating a Chef object
        Chef chef = new Chef("Gordon Ramsay", 101, "French Cuisine");
        chef.displayPersonDetails();
        chef.displaySpecialty();
        chef.performDuties();

        System.out.println("\n--------------------------\n");

        // Creating a Waiter object
        Waiter waiter = new Waiter("Alice Johnson", 102, "Main Dining");
        waiter.displayPersonDetails();
        waiter.displaySection();
        waiter.performDuties();
    }
}

