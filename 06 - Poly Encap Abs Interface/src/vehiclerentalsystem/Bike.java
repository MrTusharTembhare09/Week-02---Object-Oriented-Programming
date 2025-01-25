package vehiclerentalsystem;

// Subclass: Bike
class Bike extends Vehicle {
    // Constructor for initializing Bike attributes
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    // Calculating rental cost for a bike
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.9; // 10% discount for bikes
    }
}
