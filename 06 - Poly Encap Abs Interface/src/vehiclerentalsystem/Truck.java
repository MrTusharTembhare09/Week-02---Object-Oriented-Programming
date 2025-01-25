package vehiclerentalsystem;

// Subclass: Truck
class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor for initializing Truck attributes
    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculating rental cost for a truck
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 1000; // Flat fee of 1000 added to rental cost
    }

    // Calculating insurance cost for a truck
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.20; // 20% of the rental rate
    }

    // Getting insurance details for a truck
    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber;
    }
}
