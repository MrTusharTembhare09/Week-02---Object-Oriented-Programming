package onlinefooddiliverysystem;

// Abstract Class: FoodItem
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor for initializing food item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getting item name
    public String getItemName() {
        return itemName;
    }

    // Setting item name
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getting item price
    public double getPrice() {
        return price;
    }

    // Setting item price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getting item quantity
    public int getQuantity() {
        return quantity;
    }

    // Setting item quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Abstract method for calculating total price of the food item
    public abstract double calculateTotalPrice();

    // Displaying item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}