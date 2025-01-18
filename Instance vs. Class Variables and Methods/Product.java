// Creating the Product class
public class Product {

    // Instance variables
    private String productName;
    private double price;

    // Class variable (shared among all products)
    private static int totalProducts = 0; // Keeps track of the total number of products

    // Constructor to initialize product details
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new product is created
    }

    // Instance method to display product details
    // Displaying the details of a specific product
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class method to display total number of products
    // Showing the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        // Creating Product objects
        Product product1 = new Product("Laptop", 799.99);
        product1.displayProductDetails();

        Product product2 = new Product("Smartphone", 499.99);
        product2.displayProductDetails();

        Product product3 = new Product("Headphones", 199.99);
        product3.displayProductDetails();

        // Displaying the total number of products created
        Product.displayTotalProducts();
    }
}

