package ecommerceplatform;

// Utility Class: ECommerceManager
import java.util.*;

class ECommerceManager {
    private List<Product> products = new ArrayList<>();

    // Adding a product to the list
    public void addProduct(Product product) {
        products.add(product);
    }

    // Processing and displaying final price for all products
    public void processProducts() {
        // Iterating through each product in the list
        for (Product product : products) {
            // Displaying product details
            product.displayDetails();

            // Calculating discount and tax
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;

            // Calculating final price
            double finalPrice = product.getPrice() + tax - discount;

            // Displaying calculated values
            System.out.println("Calculated Discount: " + discount);
            System.out.println("Calculated Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------------------------------");
        }
    }
}