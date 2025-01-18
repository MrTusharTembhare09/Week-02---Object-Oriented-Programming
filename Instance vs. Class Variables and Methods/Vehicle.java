// Creating the Vehicle class
public class Vehicle {

    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable (shared among all vehicles)
    private static double registrationFee = 100.0; // Default registration fee

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    // Displaying the details of a specific vehicle
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    // Modifying the registration fee for all vehicles
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee; // Updating the static registration fee
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        // Creating Vehicle objects
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        vehicle1.displayVehicleDetails();

        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");
        vehicle2.displayVehicleDetails();

        // Updating the registration fee for all vehicles
        Vehicle.updateRegistrationFee(150.0);

        // Displaying vehicle details after updating the registration fee
        System.out.println("\nAfter updating the registration fee:\n");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}

