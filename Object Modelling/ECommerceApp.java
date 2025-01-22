import java.util.ArrayList;
import java.util.List;

// Define the Product class (represents a product)
class Product {
    private String name;
    private double price;

    // Constructor to initialize the product with a name and price
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter for the product name
    public String getName() {
        return name;
    }

    // Getter for the product price
    public double getPrice() {
        return price;
    }

    // Method to display product details
    public void displayProduct() {
        System.out.println("Product: " + name + " | Price: $" + price);
    }
}

// Define the Order class (contains multiple products)
class Order {
    private int orderId;
    private List<Product> products;  // Aggregation relationship with products

    // Constructor to initialize the order with an ID
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Getter for the order ID
    public int getOrderId() {
        return orderId;
    }

    // Method to add a product to the order
    // adding product to the order
    public void addProduct(Product product) {
        products.add(product);  // Adding product to the order's list of products
    }

    // Method to display all products in the order
    // calculating and displaying total price of products in the order
    public void viewOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double totalPrice = 0;
        for (Product product : products) {
            product.displayProduct();  // Displaying each product in the order
            totalPrice += product.getPrice();  // Calculating total price
        }
        System.out.println("Total Order Price: $" + totalPrice);  // Displaying total price for the order
    }
}

// Define the Customer class (places orders)
class Customer {
    private String name;
    private List<Order> orders;  // Association with orders

    // Constructor to initialize the customer with a name
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Getter for the customer's name
    public String getName() {
        return name;
    }

    // Method to place an order
    // adding order to the customer's list of orders
    public void placeOrder(Order order) {
        orders.add(order);  // Adding order to the customer's list of orders
    }

    // Method to view all orders placed by the customer
    // calculating and displaying all orders of the customer
    public void viewOrders() {
        System.out.println(name + "'s Orders:");
        for (Order order : orders) {
            order.viewOrderDetails();  // Displaying order details
        }
    }
}

// Main class to demonstrate the relationships and communication in the system
public class ECommerceApp {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1000.00);
        Product product2 = new Product("Phone", 500.00);
        Product product3 = new Product("Headphones", 100.00);

        // Create orders
        Order order1 = new Order(1);
        order1.addProduct(product1);  // adding laptop to the order
        order1.addProduct(product2);  // adding phone to the order

        Order order2 = new Order(2);
        order2.addProduct(product3);  // adding headphones to the order

        // Create customer and place orders
        Customer customer = new Customer("John");
        customer.placeOrder(order1);  // adding first order to the customer
        customer.placeOrder(order2);  // adding second order to the customer

        // View customer orders and products
        customer.viewOrders();  // calculating and displaying all orders for the customer
    }
}
