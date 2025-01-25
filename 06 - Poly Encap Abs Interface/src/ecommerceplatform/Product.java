package ecommerceplatform;

// Abstract Class: Product
abstract class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor for initializing product attributes
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getting product ID
    public int getProductId() {
        return productId;
    }

    // Setting product ID
    public void setProductId(int productId) {
        this.productId = productId;
    }

    // Getting product name
    public String getName() {
        return name;
    }

    // Setting product name
    public void setName(String name) {
        this.name = name;
    }

    // Getting product price
    public double getPrice() {
        return price;
    }

    // Setting product price
    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method for calculating discount
    public abstract double calculateDiscount();

    // Displaying product details
    public void displayDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }
}
