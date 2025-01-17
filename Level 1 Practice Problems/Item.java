// Creating the Item class to represent an item in a store
public class Item {

    // Declaring attributes for the item
    private int itemCode;
    private String itemName;
    private double price;

    // Creating a constructor to initialize the item attributes
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Adding a method to display item details
    public void displayItemDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Calculating the total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    // Creating the main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating an Item object with sample data
        Item item = new Item(101, "Laptop", 75000.00);

        // Displaying the item details
        item.displayItemDetails();

        // Calculating and displaying the total cost for a quantity of 3
        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for quantity " + quantity + ": " + totalCost);
    }
}
