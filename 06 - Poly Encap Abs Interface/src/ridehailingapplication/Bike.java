package ridehailingapplication;

// Subclass: Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor for Bike
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Calculating fare for bike
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // Getting current location of bike
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Updating location of bike
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
