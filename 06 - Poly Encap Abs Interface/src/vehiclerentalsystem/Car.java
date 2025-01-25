package vehiclerentalsystem;

// Subclass: Car
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    // Constructor for initializing Car attributes
    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    // Calculating rental cost for a car
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Calculating insurance cost for a car
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of the rental rate
    }

    // Getting insurance details for a car
    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy Number: " + insurancePolicyNumber;
    }
}
