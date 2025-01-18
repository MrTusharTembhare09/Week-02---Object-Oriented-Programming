// Creating the Circle class
public class Circle {

    // Declaring the radius attribute
    private double radius;

    // Adding a default constructor
    public Circle() {
        // Calling the parameterized constructor with a default value
        this(1.0); // Initializing radius to 1.0 by default
    }

    // Adding a parameterized constructor
    public Circle(double radius) {
        // Assigning the provided value to the radius attribute
        this.radius = radius;
    }

    // Adding a method to display the radius
    public void displayRadius() {
        // Printing the radius of the circle
        System.out.println("Radius: " + radius);
    }

    // Adding the main method to test the Circle class
    public static void main(String[] args) {
        // Creating a Circle object using the default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        defaultCircle.displayRadius();

        // Creating a Circle object using the parameterized constructor
        Circle specificCircle = new Circle(5.0);
        System.out.println("\nSpecific Circle:");
        specificCircle.displayRadius();
    }
}


