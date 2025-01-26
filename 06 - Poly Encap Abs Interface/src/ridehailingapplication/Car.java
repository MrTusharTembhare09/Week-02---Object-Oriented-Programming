package ridehailingapplication;

// Subclass: Car
class Car extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor for Car
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Calculating fare for car
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // Getting current location of car
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Updating location of car
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
