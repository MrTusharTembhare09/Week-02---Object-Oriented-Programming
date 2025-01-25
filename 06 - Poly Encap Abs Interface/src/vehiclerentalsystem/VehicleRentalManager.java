package vehiclerentalsystem;

// Utility Class: VehicleRentalManager
import java.util.*;

class VehicleRentalManager {
    private List<Vehicle> vehicles = new ArrayList<>();

    // Adding a vehicle to the list
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Processing and displaying rental and insurance details for all vehicles
    public void processVehicles(int rentalDays) {
        // Iterating through each vehicle in the list
        for (Vehicle vehicle : vehicles) {
            // Displaying vehicle details
            vehicle.displayDetails();

            // Calculating and displaying rental cost
            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost for " + rentalDays + " days: " + rentalCost);

            // Calculating and displaying insurance cost if applicable
            if (vehicle instanceof Insurable) {
                double insuranceCost = ((Insurable) vehicle).calculateInsurance();
                System.out.println("Insurance Cost: " + insuranceCost);
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println("-----------------------------------");
        }
    }
}
