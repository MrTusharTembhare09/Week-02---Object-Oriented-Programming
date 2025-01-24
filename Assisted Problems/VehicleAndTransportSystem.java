// Creating the superclass
class Vehicle {
    
	// Defining the attributes
	int maxSpeed;
	String fuelType;
	
	// Defining the constructor
	public Vehicle(int maxSpeed, String fuelType) {
	    this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	// Defining the method to display the information
	public void displayInfo() {
	    System.out.println("Maximum speed is : " + maxSpeed);
		System.out.println("Fuel type is : " + fuelType);
	}
}

class Car extends Vehicle {
    // Defining the attributes
    int seatCapacity;
	
	// Defining the constructor
	public Car(int maxSpeed, String fuelType, int seatCapacity) {
	    super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	// Defining the method to display the information
	@Override
	public void displayInfo() {
	    super.displayInfo();
		System.out.println("Seat capacity is : " + seatCapacity);
	}
}

class Truck extends Vehicle {
    // Defining the attributes
    int seatCapacity;
	
	// Defining the constructor
	public Truck(int maxSpeed, String fuelType, int seatCapacity) {
	    super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	// Defining the method to display the information
	@Override
	public void displayInfo() {
	    super.displayInfo();
		System.out.println("Seat capacity is : " + seatCapacity);
	}
}

class Motorcycle extends Vehicle {
    // Defining the attributes
    int seatCapacity;
	
	// Defining the constructor
	public Motorcycle(int maxSpeed, String fuelType, int seatCapacity) {
	    super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	// Defining the method to display the information
	@Override
	public void displayInfo() {
	    super.displayInfo();
		System.out.println("Seat capacity is : " + seatCapacity);
	}
}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
		
		Vehicle[] vehicles = new Vehicle[3];
		
		
	    vehicles[0] = new Car(150, "Petrol", 6);
		vehicles[1] = new Truck(90, "Diesel", 4);
		vehicles[2] = new Motorcycle(120, "Petrol", 3);
		
        // Displaying information of each vehicle using polymorphism
        System.out.println("Vehicle Details:");
        for(Vehicle vehicle : vehicles) {
            System.out.println("--------------------");
            vehicle.displayInfo();
        }
	}		
}
        		





	
	
		
	
	
