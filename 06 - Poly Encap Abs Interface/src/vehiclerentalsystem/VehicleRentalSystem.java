package vehiclerentalsystem;

// Main Class: VehicleRentalSystem
public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Creating an instance of VehicleRentalManager
        VehicleRentalManager manager = new VehicleRentalManager();

        // Adding a car to the system
        Car car = new Car("CAR123", 1000, "CARINS123");
        manager.addVehicle(car);

        // Adding a bike to the system
        Bike bike = new Bike("BIKE456", 500);
        manager.addVehicle(bike);

        // Adding a truck to the system
        Truck truck = new Truck("TRUCK789", 2000, "TRUCKINS456");
        manager.addVehicle(truck);

        // Processing and displaying rental details for all vehicles
        int rentalDays = 5; // Example rental duration
        manager.processVehicles(rentalDays);
    }
}
