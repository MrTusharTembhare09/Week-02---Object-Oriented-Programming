package vehiclerentalsystem;

// Abstract Class: Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor for initializing vehicle attributes
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getting vehicle number
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    // Setting vehicle number
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    // Getting vehicle type
    public String getType() {
        return type;
    }

    // Setting vehicle type
    public void setType(String type) {
        this.type = type;
    }

    // Getting rental rate
    public double getRentalRate() {
        return rentalRate;
    }

    // Setting rental rate
    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }

    // Abstract method for calculating rental cost
    public abstract double calculateRentalCost(int days);

    // Displaying vehicle details
    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate: " + rentalRate);
    }
}
