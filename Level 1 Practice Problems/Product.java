// Creating the Product class
public class Product {

    // Static variable shared by all products for a common discount percentage
    static double discount = 10.0; // Default discount is 10%

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0) {
            discount = newDiscount;
            System.out.println("Discount updated to " + discount + "%");
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

    // Final variable to ensure each product has a unique product ID
    private final String productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor to initialize product details using 'this'
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID; // Using this to resolve ambiguity
        this.productName = productName; // Using this to resolve ambiguity
        this.price = price; // Using this to resolve ambiguity
        this.quantity = quantity; // Using this to resolve ambiguity
    }

    // Method to display product details
    public void displayProductDetails() {
        // Using instanceof to validate the object before processing
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Cost after Discount: $" + calculateTotalCost());
        } else {
            System.out.println("Object is not an instance of Product.");
        }
    }

    // Method to calculate total cost after applying the discount
    private double calculateTotalCost() {
        double totalCost = price * quantity;
        return totalCost - (totalCost * discount / 100); // Applying discount
    }

    public static void main(String[] args) {
        // Creating Product objects
        Product product1 = new Product("P001", "Laptop", 1500.0, 2);
        Product product2 = new Product("P002", "Headphones", 200.0, 3);

        // Displaying product details
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();

        // Updating the discount percentage
        Product.updateDiscount(15.0);

        // Displaying product details again after updating the discount
        System.out.println("\nAfter updating discount:");
        product1.displayProductDetails();
        System.out.println();
        product2.displayProductDetails();
    }
}
