// Interface Refuelable
interface Refuelable {
    // Method to refuel the vehicle
    void refuel();
}

// Base class Vehicle
class Vehicle {
    // Defining common attributes for all vehicles
    String model;
    int maxSpeed;

    // Constructor to initialize Vehicle attributes
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Subclass ElectricVehicle which extends Vehicle
class ElectricVehicle extends Vehicle {
    // Defining additional attribute for ElectricVehicle
    int batteryCapacity; // Battery capacity in kWh

    // Constructor to initialize both Vehicle and ElectricVehicle attributes
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed); // Calling the constructor of Vehicle
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println(model + " is being charged. Battery capacity: " + batteryCapacity + " kWh.");
    }

    // Overriding displayVehicleDetails to include battery capacity
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails(); // Calling the base class method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass PetrolVehicle which extends Vehicle and implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    // Defining additional attribute for PetrolVehicle
    double fuelTankCapacity; // Fuel tank capacity in liters

    // Constructor to initialize both Vehicle and PetrolVehicle attributes
    public PetrolVehicle(String model, int maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed); // Calling the constructor of Vehicle
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implementing the refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println(model + " is being refueled. Fuel tank capacity: " + fuelTankCapacity + " liters.");
    }

    // Overriding displayVehicleDetails to include fuel tank capacity
    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails(); // Calling the base class method
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

// Main class to demonstrate the hybrid inheritance
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating an ElectricVehicle object
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla Model S", 250, 100);
        electricVehicle.displayVehicleDetails();
        electricVehicle.charge();

        System.out.println("\n--------------------------\n");

        // Creating a PetrolVehicle object
        PetrolVehicle petrolVehicle = new PetrolVehicle("Ford Mustang", 220, 50);
        petrolVehicle.displayVehicleDetails();
        petrolVehicle.refuel();
    }
}

