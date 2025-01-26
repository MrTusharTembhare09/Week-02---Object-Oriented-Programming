package ridehailingapplication;

// Main Class: RideHailingApplication
public class RideHailingApplication {
    public static void main(String[] args) {
        // Creating instances of different vehicles
        Vehicle car = new Car("C123", "Alice", 15.0, "Downtown");
        Vehicle bike = new Bike("B456", "Bob", 8.0, "Suburb");
        Vehicle auto = new Auto("A789", "Charlie", 10.0, "Market");

        // Displaying details and calculating fares
        System.out.println("--- Car Details ---");
        car.getVehicleDetails();
        System.out.println("Fare for 10 Km: " + car.calculateFare(10));

        System.out.println("--- Bike Details ---");
        bike.getVehicleDetails();
        System.out.println("Fare for 10 Km: " + bike.calculateFare(10));

        System.out.println("--- Auto Details ---");
        auto.getVehicleDetails();
        System.out.println("Fare for 10 Km: " + auto.calculateFare(10));
    }
}

