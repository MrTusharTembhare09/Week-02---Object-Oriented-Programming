// Creating the CarRental class
public class CarRental {

    // Declaring attributes for the class
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RENTAL_COST = 50.0; // Fixed daily rental cost

    // Default constructor
    // Initializing with default values
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    // Initializing with specific values provided by the user
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Calculating total rental cost
    // Multiplying rental days by the daily cost to calculate the total cost
    public double calculateTotalCost() {
        return rentalDays * DAILY_RENTAL_COST; // Calculating the total cost based on rental days
    }

    // Adding method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        // Creating a CarRental object using the parameterized constructor
        CarRental rental1 = new CarRental("Alice", "Toyota Corolla", 5);
        rental1.displayRentalDetails();

        // Creating a CarRental object using the default constructor
        CarRental rental2 = new CarRental();
        rental2.displayRentalDetails();
    }
}

