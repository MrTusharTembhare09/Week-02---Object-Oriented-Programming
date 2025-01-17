// Creating the MobilePhone class to represent a mobile phone
public class MobilePhone {

    // Declaring attributes for the mobile phone
    private String brand;
    private String model;
    private double price;

    // Creating a constructor to initialize the mobile phone attributes
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Adding a method to display all the details of the mobile phone
    public void displayPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    // Creating the main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating a MobilePhone object with sample data
        MobilePhone phone = new MobilePhone("Samsung", "Galaxy S23", 79999.00);

        // Displaying the phone details
        phone.displayPhoneDetails();
    }
}
