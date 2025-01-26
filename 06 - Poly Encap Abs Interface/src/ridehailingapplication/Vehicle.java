package ridehailingapplication;

// Abstract Class: Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor for initializing vehicle details
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getting vehicle ID
    public String getVehicleId() {
        return vehicleId;
    }

    // Setting vehicle ID
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    // Getting driver name
    public String getDriverName() {
        return driverName;
    }

    // Setting driver name
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    // Getting rate per kilometer
    public double getRatePerKm() {
        return ratePerKm;
    }

    // Setting rate per kilometer
    public void setRatePerKm(double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    // Abstract method for calculating fare
    public abstract double calculateFare(double distance);

    // Displaying vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: " + ratePerKm);
    }
}
