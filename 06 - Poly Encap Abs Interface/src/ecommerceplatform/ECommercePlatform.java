package ecommerceplatform;

// Main Class: ECommercePlatform
public class ECommercePlatform {
    public static void main(String[] args) {
        // Creating an instance of ECommerceManager
        ECommerceManager manager = new ECommerceManager();

        // Adding an electronics product
        Electronics laptop = new Electronics(101, "Laptop", 60000, 2);
        manager.addProduct(laptop);

        // Adding a clothing product
        Clothing shirt = new Clothing(102, "Shirt", 1500, "M");
        manager.addProduct(shirt);

        // Adding a grocery product
        Groceries rice = new Groceries(103, "Rice", 500, 10);
        manager.addProduct(rice);

        // Processing and displaying all products
        manager.processProducts();
    }
}
