// Add necessary import statements
import java.util.ArrayList;
import java.util.List;

// Product class represents the items the customer buys
class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize the product
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for Product attributes
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Adding method to update product quantity
    public void addQuantity(int quantity) {
        this.quantity += quantity;
    }

    // Method to calculate total price for this product
    public double calculateTotal() {
        return price * quantity;
    }
}

// Customer class represents the customer who buys the products
class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Product> products;

    // Constructor to initialize the customer
    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the customer's cart
    // Adding product to the customer's cart
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to get the list of products purchased by the customer
    public List<Product> getProducts() {
        return products;
    }

    // Getters for Customer attributes
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

// BillGenerator class is responsible for calculating and generating the total bill
class BillGenerator {
    // Method to calculate the total amount of the bill
    // Calculating the total for the customer
    public double calculateTotal(Customer customer) {
        double totalAmount = 0.0;

        // Loop through the products and calculate the total
        for (Product product : customer.getProducts()) {
            totalAmount += product.calculateTotal();
        }

        return totalAmount;
    }

    // Method to generate the bill for the customer
    // Generating the bill for the customer
    public void generateBill(Customer customer) {
        double totalAmount = calculateTotal(customer);

        // Displaying the bill details
        System.out.println("----- Bill Details -----");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        System.out.println("\nProducts Purchased:");
        for (Product product : customer.getProducts()) {
            System.out.println(product.getName() + " - " + product.getQuantity() + " x $" + product.getPrice() + " = $" + product.calculateTotal());
        }
        System.out.println("\nTotal Amount: $" + totalAmount);
        System.out.println("Thank you for shopping with us!");
    }
}

// Main class to run the program
public class GroceryStoreBillApp {
    public static void main(String[] args) {
        // Adding new products to the store
        Product apples = new Product("Apples", 3.00, 2);  // Price per kg is $3
        Product milk = new Product("Milk", 2.00, 1);    // Price per liter is $2

        // Adding a new customer
        Customer customer = new Customer("Alice", "123 Lane", "555-1010");

        // Adding products to the customer's cart
        customer.addProduct(apples);  // Adding apples to the cart
        customer.addProduct(milk);    // Adding milk to the cart

        // Creating an instance of BillGenerator
        BillGenerator billGenerator = new BillGenerator();

        // Generating the bill for the customer
        billGenerator.generateBill(customer);  // Generating the final bill
    }
}
