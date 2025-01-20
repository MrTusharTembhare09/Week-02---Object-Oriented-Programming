// Creating the Vehicle class
public class Vehicle {

    // Static variable shared by all vehicles for the registration fee
    static double registrationFee = 5000.0;

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    // Final variable to uniquely identify each vehicle
    private final String registrationNumber;

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize vehicle details using 'this'
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber; // Using this to resolve ambiguity
        this.ownerName = ownerName; // Using this to resolve ambiguity
        this.vehicleType = vehicleType; // Using this to resolve ambiguity
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        // Using instanceof to validate the object before processing
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Object is not an instance of the Vehicle class.");
        }
    }

    public static void main(String[] args) {
        // Creating Vehicle objects
        Vehicle vehicle1 = new Vehicle("MH12AB1234", "Alice", "Car");
        Vehicle vehicle2 = new Vehicle("MH14XY5678", "Bob", "Bike");

        // Displaying details of each vehicle
        System.out.println("Vehicle Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();

        // Updating the registration fee
        System.out.println("\nUpdating Registration Fee:");
        Vehicle.updateRegistrationFee(5500.0);

        // Displaying details after updating the registration fee
        System.out.println("\nUpdated Vehicle Details:");
        vehicle1.displayVehicleDetails();
        System.out.println();
        vehicle2.displayVehicleDetails();
    }
}
