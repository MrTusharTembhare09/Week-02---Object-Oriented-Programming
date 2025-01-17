// Simplifying the CartItem and Cart classes
public class CartItem {

    // Declaring attributes for the cart item
    private String itemName;
    private double price;
    private int quantity;

    // Creating a constructor to initialize the cart item attributes
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Calculating the total cost of the cart item
    public double calculateTotalCost() {
        return price * quantity;
    }

    // Main class to manage the cart
    public static class Cart {

        // Storing total cost directly to simplify operations
        private double totalCost;

        // Adding an item to the cart and updating total cost
        public void addItem(String itemName, double price, int quantity) {
            CartItem item = new CartItem(itemName, price, quantity);
            totalCost += item.calculateTotalCost();
            System.out.println("Added item: " + itemName);
        }

        // Removing an item's cost from the total (simplified for single items)
        public void removeItem(double itemCost) {
            totalCost -= itemCost;
            System.out.println("Removed item costing: " + itemCost);
        }

        // Displaying the total cost of all items in the cart
        public void displayTotalCost() {
            System.out.println("Total Cost: " + totalCost);
        }
    }

    // Creating the main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating a Cart object
        Cart cart = new Cart();

        // Adding items to the cart
        cart.addItem("Laptop", 50000.0, 1);
        cart.addItem("Mouse", 500.0, 2);
        cart.addItem("Keyboard", 1500.0, 1);

        // Displaying the total cost
        cart.displayTotalCost();

        // Removing an item from the cart (cost manually provided for simplicity)
        cart.removeItem(1000.0);

        // Displaying the total cost after removal
        cart.displayTotalCost();
    }
}
