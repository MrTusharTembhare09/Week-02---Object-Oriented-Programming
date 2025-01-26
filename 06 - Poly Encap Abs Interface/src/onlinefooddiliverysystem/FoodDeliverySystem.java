package onlinefooddiliverysystem;

// Main Class: FoodDeliverySystem
public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Creating food items
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300, 1, 50);

        // Applying discounts
        ((Discountable) vegItem).applyDiscount(10); // Applying 10% discount on veg item
        ((Discountable) nonVegItem).applyDiscount(5); // Applying 5% discount on non-veg item

        // Displaying details and total price for veg item
        System.out.println("--- Veg Item Details ---");
        vegItem.getItemDetails();
        System.out.println(((Discountable) vegItem).getDiscountDetails());
        System.out.println("Total Price: " + vegItem.calculateTotalPrice());

        // Displaying details and total price for non-veg item
        System.out.println("--- Non-Veg Item Details ---");
        nonVegItem.getItemDetails();
        System.out.println(((Discountable) nonVegItem).getDiscountDetails());
        System.out.println("Total Price: " + nonVegItem.calculateTotalPrice());
    }
}
