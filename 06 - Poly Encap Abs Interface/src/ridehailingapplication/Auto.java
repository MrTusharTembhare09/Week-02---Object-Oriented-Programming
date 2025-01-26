package ridehailingapplication;

// Subclass: Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor for Auto
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Calculating fare for auto
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // Getting current location of auto
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    // Updating location of auto
    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}